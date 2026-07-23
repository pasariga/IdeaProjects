package Day04;

public class Array18 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
       int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int SecondMax=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>SecondMax&&arr[j]!=max){
                SecondMax=arr[j];
            }
        }
        System.out.print(SecondMax);
    }
}
