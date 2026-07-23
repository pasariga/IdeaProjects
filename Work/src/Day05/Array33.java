package Day05;

import java.util.Arrays;

public class Array33 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int[] newarr=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            newarr[j]=arr[j]*2;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
