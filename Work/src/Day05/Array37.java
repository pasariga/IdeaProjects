package Day05;

import java.util.Arrays;

public class Array37 {
    public static void main(String[] args) {
        int[] arr={3,0,2,0,5};
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newarr[i]=-1;
            }
            else{
                newarr[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
