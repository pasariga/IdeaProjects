package Demo04;
//只要这个类里出现了抽象方法，这个类本身就要是抽象类
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public abstract void eat();
}
