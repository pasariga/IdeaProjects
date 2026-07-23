package Day06;

public class Method14 {
    public static void main(String[] args) {
    int result=getSum(5,8);
    System.out.println(result);
    }
    public static int getSum(int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }

}
