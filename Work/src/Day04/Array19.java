package Day04;

public class Array19 {
    public static void main(String[] args) {
        int[] arr={8,2,10,5,7};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
