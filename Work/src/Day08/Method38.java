package Day08;

public class Method38 {
    public static void main(String01[] args) {
        int result = sumOdd(23,45);
        System.out.println(result);
    }
    public static int sumOdd(int a, int b) {
        int sum = 0;
        for(int i = Math.min(a,b)+1; i < Math.max(a,b); i++){
            if(i%2!=0){
                sum += i;
            }
        }
        return sum;
    }
}
