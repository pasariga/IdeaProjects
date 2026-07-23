package Demo10;

public class SumTimes {
    public static void main(String[] args) {
        int[] arr={3,9,2,9,5,9,1};
        int count=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }
}
