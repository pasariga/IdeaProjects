package Day11;

public class Test01 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Tom";
        s2.name="Jerry";
        s1.age=18;
        System.out.println(s2.name);
        System.out.println(s1.age);
        s1.study();
    }

}
