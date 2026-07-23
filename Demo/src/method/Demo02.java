package method;

public class Demo02 {
    //main方法
    public static void main(String[] args) {
        int max=max(10,20);
        System.out.println(max);
    }
    //比大小
    public static int max(int num1,int num2){
        int result=0;
        if(num1>num2){
            result=num1;
        }
        else if(num2>num1){
            result=num2;
        }
        else{
            System.out.println("num1==num2");
            return 0;
        }
        return result;
    }
}
