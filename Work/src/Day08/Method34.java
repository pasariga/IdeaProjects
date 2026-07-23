package Day08;

public class Method34 {
    public static void main(String01[] args) {
        boolean result = isComprime(8,15);
        System.out.println(result);
    }
    public static boolean isComprime(int a,int b){
        int temp=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                temp=i;
            }
        }
        return temp==1;
    }
}
