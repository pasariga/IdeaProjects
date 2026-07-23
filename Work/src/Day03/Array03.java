package Day03;

public class Array03 {
    public  static void main(String[] args) {
        int[] arr = {3,8,2,15};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
