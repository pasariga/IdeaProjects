package array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        System.out.println(a);
        //打印数组元素
        System.out.println(Arrays.toString(a));

        printArray(a);
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            if(i==0){
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i] + ",");
            }
        }
    }
}
