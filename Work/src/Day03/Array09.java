package Day03;

public class Array09 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int temp=arr[arr.length-1];
        arr[arr.length-1]=arr[0];
        arr[0]=temp;
        for(int j=0;j<arr.length;j++){
            System.out.println(j+1+":"+arr[j]);
        }
    }
}
