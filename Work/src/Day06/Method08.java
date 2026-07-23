package Day06;

public class Method08 {
    public static void main(String[] args) {
        int result=getMax(3,6,9);
        System.out.println(result);
    }
    public static int getMax(int a,int b,int c){
        int [] arr={a,b,c};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
