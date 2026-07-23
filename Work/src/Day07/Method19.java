package Day07;

public class Method19 {
    public static void main(String[] args) {
        int result=countOdd(14);
        System.out.println(result);
    }
    public static int countOdd(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                count++;
            }
        }
        return count;
    }
}
