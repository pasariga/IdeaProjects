package Day07;

public class Method31 {
    public static void main(String[] args) {
        int result = diffSquareSum(5);
        System.out.println(result);
    }
    public static int diffSquareSum(int n){
        int oddsum = 0;
        int evensum = 0;
        for (int i = 1; i <= n; i++){
            if(i%2==0){
                evensum += i*i*i;
            }
            else{
                oddsum += i*i*i;
            }
        }
        return evensum-oddsum;
    }
}
