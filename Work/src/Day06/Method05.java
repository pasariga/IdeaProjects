package Day06;

public class Method05 {
    public static void main(String[] args) {
        boolean result=Even(10);
        System.out.println(result);
    }
    public static boolean Even(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}
