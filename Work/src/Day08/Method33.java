package Day08;

public class Method33 {
    public static void main(String01[] args) {
        int result = lcm(12,18);
        System.out.println(result);
    }
    public static int lcm(int a,int b){
        int temp=b;
        for(int i=b;i<=a*b;i++){
            if(i%a==0&&i%b==0){
                temp=i;
                break;
            }
        }
        return temp;
    }
}
