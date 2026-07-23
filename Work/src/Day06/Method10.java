package Day06;

public class Method10 {
    public static void main(String[] args) {
        int result=factorial(7);
        System.out.println(result);
    }
    public static int factorial(int n){
        int m=1;
        for(int i=1;i<=n;i++){
            m*=i;
        }
        return m;
    }
}
