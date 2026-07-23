package Day04;

public class Array14 {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,5};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==8){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("存在");
        }
        else{
            System.out.println("不存在");
        }
    }
}
