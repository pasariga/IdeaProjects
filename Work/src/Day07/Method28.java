package Day07;

public class Method28 {
    public static void main(String[] args) {
        int result = evenCubeSum(4);
        System.out.println(result);
    }
    public static int evenCubeSum(int n){
        int sum=0;
        for (int i = 1; i <= n; i++){
            if (i%2==0){
                sum+=i*i*i;
            }
        }
        return sum;
    }
}
