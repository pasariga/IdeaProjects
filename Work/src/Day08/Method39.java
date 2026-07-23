package Day08;

public class Method39 {
    public static void main(String01[] args) {
        int result = sumEven(13,45);
        System.out.println(result);
    }
    public static int sumEven(int a, int b) {
        int sum = 0;
        for(int i = Math.min(a,b)+1; i < Math.max(a,b); i++){
            if(i%2==0){
                sum += i*i;
            }
        }
        return sum;
    }
}
