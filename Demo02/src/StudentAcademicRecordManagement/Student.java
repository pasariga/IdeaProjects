package StudentAcademicRecordManagement;

public class Student {
    private String studentId;
    private String name;
    private double score;
    public Student(String studentId, String name, double score){
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
