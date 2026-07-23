package Day06;

public class Method03 {
    public static void main(String[] args) {
        int result=getsum(100);
        System.out.println(result);
    }
    public static int getsum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
