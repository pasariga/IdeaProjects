package Day04;



public class Array11 {
    public  static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println(max-min);
    }
}
