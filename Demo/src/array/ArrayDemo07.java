package array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] agrs){
        int[] a={1,7,4,2,4,3};
        int[] sort=sort(a);
        System.out.print(Arrays.toString(sort));
    }

    //冒泡排序
    public static int[] sort(int[] array){
       int temp=0; //临时变量
        for(int i=0;i<array.length-1;i++){
            boolean flag=false;
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j]){
                     temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }return array;
    }
}

