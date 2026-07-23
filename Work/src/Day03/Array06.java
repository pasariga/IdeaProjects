package Day03;

public class Array06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
