package Day04;

public class Array22 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=sum/arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>average){
                count++;
            }
        }
        System.out.println("大于平均数"+average+"的数有"+count+"个");
    }
}
