package Day04;

public class Array21 {
    public static void main(String[] args) {
        int [] arr={8,3,2,10,5,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println("第"+(i+1)+"个："+arr[i]);
                count++;
            }
        }
        System.out.println("奇数的个数为："+count);
    }
}
