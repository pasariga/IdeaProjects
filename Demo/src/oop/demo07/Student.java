package oop.demo07;



public class Student extends Person {
    private static  int age;
    private double score;
    public void run(){
        go();
    }
    public static void go(){

    }

    public static void main(String[] args) {

        new Student().run();
        Student.go();
        go();
    }
}
