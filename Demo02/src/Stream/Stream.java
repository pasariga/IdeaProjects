package Stream;


import Demo06.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 55));
        students.add(new Student("李四", 85));
        students.add(new Student("王五", 92));
        students.add(new Student("赵六", 70));
        List<String>topStudents=students.stream()
                .filter(student -> student.getScore()>=80)
                .map(student -> student.getName())
                .collect(Collectors.toList());
        //List<String>topStudents=students.stream();
        System.out.println(topStudents);
    }
}
