package Day05;

public class Array32 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int[] newarr=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            newarr[j]=arr[arr.length-1-j];
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(newarr[j]+" ");
        }
    }
}
