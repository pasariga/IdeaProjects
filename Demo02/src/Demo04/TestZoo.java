package Demo04;

import Demo05.Duck;
import Demo05.Pool;

public class TestZoo {
    public static void main(String[] args) {
        Feeder f1=new Feeder("hikarisq");
        Dog d1=new Dog("Mario",6);
        Cat c1=new Cat("Tom",3);
        Duck d2=new Duck("Donald",4);
        Pool p1=new Pool();
        p1.letItSwim(d1);
        p1.letItSwim(d2);
    }
}
