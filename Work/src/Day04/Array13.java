package Day04;

public class Array13 {
    public static void main(String[] args) {
        int[] arr={3,7,9,10,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
}
