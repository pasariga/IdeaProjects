package Day06;

public class Method06 {
    public static void main(String[] args) {
        int result=getMax(3,7);
        System.out.println(result);
    }
    public static int getMax(int a, int b) {
        return a>b?a:b;
    }
}
