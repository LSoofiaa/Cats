package me.sofdev.cats;

import me.sofdev.cats.objects.Cat;
import me.sofdev.cats.objects.Kitties;

import java.util.*;

public class Main {
    public static Set<Cat> cats = new HashSet<>();
    private final static String[] names = {
            "Odie", "Snoopy", "Slinky", "Toto", "Balto", "Marley", "Bolt", "Golfo",
            "Pongo", "Beethoven", "Hachiko", "Benji", "Scooby", "Clifford", "Astro",
            "Goofy", "Chip", "Einstein", "Fang", "Frank", "Rin Tin Tin", "Milo",
            "Truman", "Uggie", "Bingo", "Blue", "Cometa", "Krypto", "Max", "Huesos",
            "Aisuru", "Akari", "Akira", "Daisuke", "Eiko", "Minako", "Takara", "Yasu",
            "Kunio", "Hitoshi", "Yoshito", "Masumi"};
    private final int AmountOfKitties = 10;

    public Main() throws InterruptedException {
        this.init();
    }

    public void init() throws InterruptedException {
        // Random kitties :3
        for (int i = 0; i < AmountOfKitties ; i++) {
            int r = new Random().nextInt(5);
            if (r > 1) {
                if ((new Random().nextInt(50)) < 25) {
                    cats.add(new Cat(r, names[new Random().nextInt(names.length)]));
                } else {
                    cats.add(new Kitties(r, names[new Random().nextInt(names.length)]));
                }
            }
        }
        System.out.println("Amount of kitties: " + cats.size());
        StringBuilder builder = new StringBuilder();
        for (Cat cat : cats) {
            builder.append(" ");
            if (!(cat instanceof Kitties)) {
                builder.append(cat.getName()).append(" - Age: ").append(cat.getAge()).append((cat.getAge() > 1 ? " years" : " year")).append("\n");
            } else {
                builder.append(cat.getName()).append(" - Age: ").append(cat.getAge()).append((cat.getAge() > 1 ? " months" : " month")).append("\n");
            }
        }

        Thread.sleep(1500);
        System.out.println("Kitties: " + "\n" + builder);
    }

    public static void main(String[] args) throws InterruptedException {
        new Main();
    }
}
