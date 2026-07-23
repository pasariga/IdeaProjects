package Day04;
public class Array12 {
    public static void main(String args[]){
        int[] arr={3,8,2,10,5};
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println((double)sum/arr.length);
    }
}
