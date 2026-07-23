package Day05;

import java.util.Arrays;

public class Array34 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int[] newarr=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                newarr[j]=arr[j]*2;
            }
            else{
                newarr[j]=arr[j];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
