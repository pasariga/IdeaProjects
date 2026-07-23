package Work08;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] arr=new int[8];
        Scanner sc=new Scanner(System.in);
        //输入8个整数
        System.out.println("请输入8个整数：");
        for(int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
            int max=arr[0];
            int min=arr[0];
            int evenSum=0;
        for(int i=0;i<arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("max is:"+max+",min is:"+min);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
        }
        System.out.println("evenSum is:"+evenSum);
    }
}
