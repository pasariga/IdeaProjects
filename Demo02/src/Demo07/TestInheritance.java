package Demo07;

public class TestInheritance {
    public static void main(String[] args) {
       Pool p=new Pool();
       Dog d1=new Dog("Jerry");
       Duck d2=new Duck("Donald");
       Cat c1=new Cat("Brown");
       p.letItSwim(d1);
       p.letItSwim(d2);
//       p.letItSwim(c1);
    }
}
