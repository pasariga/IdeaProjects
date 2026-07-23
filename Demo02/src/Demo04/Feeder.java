package Demo04;

public class Feeder {
    private String FeederName;
    public Feeder(String FeederName){
        this.FeederName = FeederName;
    }
/*    public void feed(Dog dog){
        System.out.print(FeederName+" is feeding a dog. ");
        dog.eat();
    }
    public void feed(Cat cat){
        System.out.print(FeederName+" is feeding a cat. ");
        cat.eat();
    }*/
    public void feed(Animal animal){
        System.out.print(FeederName+" is feeding an animal. ");

    }
}
