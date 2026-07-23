package Day06;

public class Method13 {
    public static void main(String[] args) {
        printPrime(100);
    }
    public static void printPrime(int n){
        for(int i=2;i<=n;i++){
            boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+"\t");
            }
        }
    }
}
