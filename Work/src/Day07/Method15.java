package Day07;

public class Method15 {
    public static void main(String[] args) {
        int result=getSum(7,23);
        System.out.println(result);
    }
    public static int getSum(int a,int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
