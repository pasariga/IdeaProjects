package Day05;

import java.util.Arrays;

public class Array38 {
    public static void main(String[] args) {
        int[] arr = {3,-2,0,-5,4};
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newarr[i]=-arr[i];
            }
            else{
                newarr[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
