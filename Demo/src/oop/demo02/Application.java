package oop.demo02;

import oop.demo03.Pet;

public class Application {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.name="甘志豪";
        pet.age=20;
        System.out.print(pet.name);
        pet.bark();
        System.out.println(pet.age);
        Pet cat = new Pet();
        cat.name="孙浩";
        cat.age=20;
        System.out.print(cat.name);
        cat.bark();
        System.out.print(cat.age);
    }
}
