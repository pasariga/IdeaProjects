package Day05;

public class Array27 {
    public static void main(String[]args){
        int[] arr={9,7,5,3,1};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("是降序");
        }
        else{
            System.out.println("不是降序");
        }
    }
}
