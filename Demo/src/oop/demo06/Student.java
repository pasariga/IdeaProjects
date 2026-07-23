package oop.demo06;

public class Student extends Person{
    public void go(){
        System.out.println("Student go");
    }
}


/*
 //Object>Person>Student
    //Object>String
    public static void main(String[] args) {
        //Object>String
        //Object>Person>Student
        //Object>Person>Teacher
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("==========");
        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错
        System.out.println("=======");
        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);
        //System.out.println(student instanceof String);
        /
 */
