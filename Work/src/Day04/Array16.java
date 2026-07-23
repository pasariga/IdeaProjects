package Day04;

public class Array16 {
    public static void main(String[] args) {
        int[] arr={3,7,8,10,5};
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
