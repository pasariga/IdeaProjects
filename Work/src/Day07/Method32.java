package Day07;

public class Method32 {
    public static void main(String[] args) {
        int result = gcd(12,18);
        System.out.println(result);
    }
    public static int gcd(int a,int b){
        int temp=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                if(temp<i){
                    temp=i;
                }
            }
        }
        return temp;
    }
}
