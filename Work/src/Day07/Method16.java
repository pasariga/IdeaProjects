package Day07;

public class Method16 {
    public static void main(String[] args) {
        int result=getOddSum(7,23);
        System.out.println(result);
    }
    public static int getOddSum(int a,int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
