package base;

public class ForDemo04 {
    public static void main(String[] args) {
        //九九乘法表
        for(int j=1;j<10;j++)
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
