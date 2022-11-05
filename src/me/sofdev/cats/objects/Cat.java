package me.sofdev.cats.objects;

public class Cat {
    private final int age;
    private final String name;

    public Cat(int a, String name) {
        this.age = a;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
