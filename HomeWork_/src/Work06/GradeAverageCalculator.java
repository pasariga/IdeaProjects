package Work06;

public class GradeAverageCalculator {
    private double score1;
    private double score2;
    private double score3;
    private int stuNum;
    public GradeAverageCalculator(double score1, double score2, double score3, int stuNum) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.stuNum = stuNum;
    }
    public double calculateAverage(){
        return (score1+score2+score3)/3;
    }
    public static void main(String[] args) {
        GradeAverageCalculator g = new GradeAverageCalculator(79,89,87,2024110789);
        System.out.println(g.calculateAverage()+"\n"+ g.stuNum);

    }
}
