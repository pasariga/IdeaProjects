package Demo10;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr={3,9,2,9,5,9,1};
        int max=arr[0];
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<max&&arr[i]>SecondMax)
            {
                SecondMax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(SecondMax);
    }
}
