package Day04;

public class Array20 {
    public static void main(String[] args) {
        int[] arr={8,3,2,10,5,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min&&arr[i]%2==0){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
