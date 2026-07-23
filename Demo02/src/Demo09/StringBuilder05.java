package Demo09;

public class StringBuilder05 {
    public  static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String str = appendEven(arr);
        System.out.println(str);

    }
    public static String appendEven(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                sb.append(arr[i]).append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
