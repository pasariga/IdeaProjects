package Demo02;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void playWithDog(Dog dog) {
        System.out.println(name+" is playing with dog");
        dog.bark();
    }
    public void playWithDog(Dog dog,int minutes){
        System.out.println(name+" is playing with dog"+" for "+minutes+" minutes");
    }

}
