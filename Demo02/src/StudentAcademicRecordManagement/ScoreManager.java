package StudentAcademicRecordManagement;

import java.util.HashMap;

public class ScoreManager {
    //key是String,Value是Student
    HashMap<String,Student> students = new HashMap<>();
    void addStudent(Student student){
        if(students.containsKey(student.getStudentId())) {
            System.out.println("The student with id " + student.getStudentId() + " already exists");
        }
        else{
        students.put(student.getStudentId(), student);
    }
        }
    double getScore(String studentId){
        Student student = students.get(studentId);
        if(student != null){
            return student.getScore();
        }
        return -1.0;
    }
    void printAllStudents(){
        for(Student student : students.values()){
            System.out.println("学号："+student.getStudentId()+" 姓名："+student.getName()+" 成绩："+student.getScore());
        }
    }
}
