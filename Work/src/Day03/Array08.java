package Day03;

public class Array08 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int n=1;
        for(int j=arr.length-1;j>=0;j--){

            System.out.println(n+":"+arr[j]);
            n++;
        }
    }
}
