package FinalTest;

public class Test {
    public static void main (String[] args) {
        Student s1=new Student("Taylor");
        Employee e1=new Employee("Swift");
        s1.eat();
        s1.sleep();
        e1.eat();
        e1.sleep();
    }
}
class Person {
    String name;

     public Person(String name) {
         this.name = name;
     }
     void eat(){
         System.out.println(name+" is eating");
     }
     void sleep(){
         System.out.println(name+" is sleeping");
     }

 }
class Student extends Person{

    public Student(String name){
        super(name);
    }
    @Override
    void  eat(){
        System.out.println(this.name+" is eating soup.");
    }
}
class Employee extends Person{
    public Employee(String name){
        super(name);
    }
    @Override
    void  eat(){
        System.out.println(this.name+" is eating dumpling.");
    }
}
