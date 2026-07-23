package FinalTest;

public class Score{
    public static void main(String[] args){
        double[] scores = {89,95,60,59.9,61.5};
        System.out.println("所有元素:");
        for(double s:scores){
            System.out.print(s+" ");
        }
        System.out.println();
        double sum=0;
        for(double s:scores){
            sum+=s;
        }
        System.out.println(sum);
        double average=sum/scores.length;
        System.out.println(average);
    }
}
