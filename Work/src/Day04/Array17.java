package Day04;

public class Array17 {
    public static void main(String[] args) {
        int[] arr = {3,8,2,10,5};
        int OddCount = 0;
        int EvenCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                OddCount++;
            }
            else{
                EvenCount++;
            }
        }
        System.out.println(OddCount);
        System.out.println(EvenCount);
    }
}
