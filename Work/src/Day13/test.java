package Day13;

import static Day13.Person2.*;

public class test {
    public static void main(String[] args) {
        Person2 p1=new Person2("Taylor Swift",4);
        Person2 p2=new Person2("Swift",3);
        Person2 p3=new Person2("Lukas",3);
        Person2 p4=new Person2("Swift",3);
        Person2 p5=new Person2("Lukas",3);
        Person2[] arr={p2,p3,p4,p5};
        //add将arr中的null跳过
        p1.addFriends(arr);
        System.out.println(removeSpaces(p1.getName()));
    }
}