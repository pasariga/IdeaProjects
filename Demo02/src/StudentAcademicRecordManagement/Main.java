package StudentAcademicRecordManagement;

public class Main {
    public static void main(String[] args) {
        ScoreManager scoreManager = new ScoreManager();
        Student s1=new Student("S01","xiaoming",88.7);
        Student s2=new Student("S02","hong",78.3);
        Student s3=new Student("S03","zhu",98.2);
        Student s4=new Student("S01","xiao",82.7);
        scoreManager.addStudent(s1);
        scoreManager.addStudent(s2);
        scoreManager.addStudent(s3);
        scoreManager.addStudent(s4);
        System.out.println("The score of S01 is "+scoreManager.getScore("S01"));
        System.out.println("The score of S99 is "+scoreManager.getScore("S99"));
        scoreManager.printAllStudents();
    }
}
