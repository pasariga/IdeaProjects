package Work04;

public class Integer_multiple {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            if(i%7==0||containsSeven(i)){
                count++;
                sum+=i;
            }
        }
        System.out.println("The sum is "+sum);
        System.out.println("The count is "+count);
    }
    public static boolean containsSeven(int num){
        while(num>0){
            if(num%10==7){
                return true;
            }
            num=num/10;
        }
        return false;
    }
}
