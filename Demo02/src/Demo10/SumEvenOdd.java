package Demo10;

public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr={3,9,2,9,5,9,1};
        int Even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                Even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(Even);
        System.out.println(odd);
    }
}
