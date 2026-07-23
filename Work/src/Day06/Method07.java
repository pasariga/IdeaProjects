package Day06;

public class Method07 {
    public static void main(String[] args) {
        int result=abs(-4);
        System.out.println(result);
    }
    public static int abs(int a){
        if(a<0){
            return -a;
        }
        return a;
    }
}
