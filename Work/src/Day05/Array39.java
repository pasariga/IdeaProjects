package Day05;

public class Array39 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
