package Day03;

public class Array05 {
    public static void main(String[] args) {
        int[] arr = {3,8,2,15};
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                System.out.print(arr[j]+"\t");
            }
        }
    }
}
