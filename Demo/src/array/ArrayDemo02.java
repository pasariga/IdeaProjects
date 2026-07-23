package array;

public class ArrayDemo02 {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(a[0]);
        //默认初始化为零
        int[] b=new int[10];
        b[0]=10;
        System.out.println(b[0]);
        //没有被赋值，则默认初始化为零
        System.out.println(b[1]);
        System.out.println(b[2]);

    }

}
