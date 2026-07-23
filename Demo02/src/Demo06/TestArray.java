package Demo06;

public class TestArray {
    public static void main(String[] args) {
        Student[] students = {
                 new Student("hikarisq", 97),
         new Student("lukas", 88),
         new Student("mario", 55)
        };
        for(int i=0;i<students.length;i++){
            if(students[i].getScore()>=60){
                System.out.println(students[i].getName()+" "+students[i].getScore());
            }
        }
    }
}
