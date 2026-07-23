package Day05;

public class Array25 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        double average=(double)sum/arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<average){
                count++;
            }
        }
        System.out.println(count);
    }
}
