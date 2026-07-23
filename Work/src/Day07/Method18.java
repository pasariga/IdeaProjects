package Day07;

public class Method18 {
    public static void main(String[] args) {
        int result=getEven(14);
        System.out.println(result);
    }
    public static int getEven(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
}
