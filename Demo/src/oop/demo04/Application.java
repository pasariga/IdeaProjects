package oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("甘志豪");
        s1.setAge(70);
        s1.setId(1884415154);
        s1.setGender("Unkown");

        System.out.print(s1.getName()+":"+s1.getAge()+"性别"+":"+s1.getGender());


    }
}
