package Day04;

public class Array15 {
    public static void main(String[] args) {
        int[] arr={3,8,6,10,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
