package Demo09;

public class StringBuilder04 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String str=appendOdd(arr);
        System.out.println(str);
    }
    public static String appendOdd(int[] arr){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
