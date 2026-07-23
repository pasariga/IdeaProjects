package base;

public class ForDemo01 {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
            System.out.println(i);
        }
        System.out.println("while循环结束");
        for(i=0;i<=100;i++){

            System.out.println(i);
        }
        System.out.println("for循环结束");

    }
}
