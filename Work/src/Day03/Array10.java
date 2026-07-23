package Day03;

public class Array10 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};

        for(int j=0;j<arr.length/2;j++){

              int  temp=arr[j];
                arr[j]=arr[arr.length-1-j];
                arr[arr.length-1-j]=temp;
            }
        for(int i=0;i<arr.length;i++){
            System.out.println(i+1+":"+arr[i]);
        }
    }
}
