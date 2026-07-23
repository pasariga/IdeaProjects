package Work06;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Taylor",21);
        Person p2 = new Person("Swift",22);
        Person p3 = new Person("Lukas",23);
        // 调用访问方法
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // 调用修改方法
        p1.setName("NewName");
        p1.setAge(30);
        p1.speak();
        p2.speak();
        p3.speak();
    }
}
