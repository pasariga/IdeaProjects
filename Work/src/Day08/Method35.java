package Day08;

public class Method35 {
    public static void main(String01[] args) {
        int result = countEven(14,22);
        System.out.println(result);
    }
    public static int countEven(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
}
