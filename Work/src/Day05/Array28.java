package Day05;

public class Array28 {
    public static void main(String[] args) {
        int[] arr={9,7,5,3,1};
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("没有重复元素" );
        }
        else{
            System.out.println("有重复元素");
        }
    }
}
