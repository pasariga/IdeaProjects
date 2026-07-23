package Day07;

public class Method27 {
    public static void main(String[] args) {
        int result = primeSum(10);
        System.out.println(result);
    }
    public static int primeSum(int n){
        int sum = 0;
        for (int i = 2; i <= n; i++){
            boolean flag=true;
            for (int j = 2; j< i; j++){
                if (i % j == 0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                sum+=i;
            }
        }
        return sum;
    }
}
