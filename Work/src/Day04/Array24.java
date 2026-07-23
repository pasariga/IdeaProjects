package Day04;

public class Array24 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=sum/arr.length;
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>average){
                System.out.println(arr[j]);
                break;
            }
        }
    }
}
