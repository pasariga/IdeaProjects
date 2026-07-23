package Day06;

public class Method12 {
    public static void main(String[] args) {
        Even(12);
    }

    private static void Even(int n) {
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
