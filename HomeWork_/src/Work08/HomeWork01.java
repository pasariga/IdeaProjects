package Work08;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        int temp=0;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
