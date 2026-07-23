package Day07;

public class Method20 {
    public static void main(String[] args) {
        int result = squareSum(4);
        System.out.println(result);
    }
    public static int squareSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i*i;
        }
        return sum;
    }
}
