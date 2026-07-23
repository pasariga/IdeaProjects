package Day07;

public class Method30 {
    public static void main(String[] args) {
        int result = diffSquareSum(5);
        System.out.println(result);
    }
    public static int diffSquareSum(int n){
        int oddsum = 0;
        int evensum = 0;
        for (int i = 1; i <= n; i++){
            if(i%2==0){
                evensum += i*i;
            }
            else{
                oddsum += i*i;
            }
        }
        return evensum-oddsum;
    }
}
