package Day07;

public class Method26 {
    public static void main(String[] args) {
        int result = oddSquareSum(5);
        System.out.println(result);
    }
    public static int oddSquareSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                sum += i*i;
            }
        }
        return sum;
    }
}
