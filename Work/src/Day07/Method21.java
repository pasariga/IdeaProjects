package Day07;

public class Method21 {
    public static void main(String[] args) {
        int result=cubeSum(4);
        System.out.println(result);
    }
    public static int cubeSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i*i;
        }
        return sum;
    }
}
