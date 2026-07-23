package Demo05;

import Demo04.Animal;
import Demo04.Swimmable;

public class Duck extends Animal implements Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming on the water surface.");
    }
    public void eat() {
        System.out.println("Duck is eating aquatic plants.");
    }
}
