package Demo02;

public class TestInteraction {
    public static void main(String[] args) {
        Person p1=new Person("hikarisq");
        Dog d1=new Dog("Mario",6);
        p1.playWithDog(d1);
        p1.playWithDog(d1,5);
    }
}
