package Day05;

import java.util.Arrays;

public class Array36 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>5){
                newarr[i]=5;
            }
        else{
            newarr[i]=arr[i];
            }
    }
        System.out.println(Arrays.toString(newarr));

    }
}
