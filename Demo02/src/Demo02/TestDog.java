package Demo02;

public class TestDog {
    public static void main(String[] args) {
        Dog d1=new Dog("Mario",0);
        //d1.age=-5;
        d1.setAge(-10);
        System.out.println(d1.getAge());
        d1.setAge(3);
        System.out.println(d1.getAge());
    }
}
