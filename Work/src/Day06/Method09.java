package Day06;

public class Method09 {
    public static void main(String[] args) {
        int result=getSum(5);
        System.out.println(result);
    }
    public static int getSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
