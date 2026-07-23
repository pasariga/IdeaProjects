package Day07;

public class Method29 {
    public static void main(String[] args) {
        int result = oddCubeSum(5);
        System.out.println(result);
    }
    public static int oddCubeSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                sum += i*i*i;
            }
        }
        return sum;
    }
}
