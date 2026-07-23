package Day07;

public class Method22 {
    public static void main(String[] args) {
        int result=sumOf3(10);
        System.out.println(result);
    }
    public static int sumOf3(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%3==0){
                sum+=i;
            }
        }
        return sum;
    }
}
