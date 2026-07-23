package Day07;

public class Method24 {
    public static void main(String[] args) {
        int result = count3(20);
        System.out.println(result);
    }
    public static int count3(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                count++;
            }
        }
        return count;
    }
}
