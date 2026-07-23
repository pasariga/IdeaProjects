package Day07;

public class Method17 {
    public static void main(String[] args) {
        int result=getPrime(24);
        System.out.println(result);
    }
    public static int getPrime(int n){
        int count=0;
        for (int i=2;i<=n;i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flag=false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
