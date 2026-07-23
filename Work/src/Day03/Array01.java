package Day03;

public class Array01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,11,5,6,10,7,8,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
