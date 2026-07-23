package Day04;

public class Array23 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=sum/arr.length;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>average){
                System.out.println("第一个大于平均值的数是："+arr[j]);
                break;
            }
        }
    }
}
