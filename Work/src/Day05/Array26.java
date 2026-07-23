package Day05;

public class Array26 {
    public static void main(String args[]){
        int[] arr={3,8,2,10,5};
        int temp=Integer.MIN_VALUE;
        boolean flag=true;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<temp){
                flag=false;
                break;
            }
            temp=arr[j];
        }
        if(flag){
            System.out.println("是升序");
        }
        else{
            System.out.println("不是升序");
        }
    }
}
