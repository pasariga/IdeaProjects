package Day03;

public class Array04 {
    public static void main(String[] args) {
        int[] arr = {3,8,2,15};
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>5){
                count++;
            }
        }
        System.out.println(count);

    }
}
