package Demo09;

public class StringBuilder01 {
    public static void main(String[] args) {
        String[] arr={"java","MYSQL","HTML","CSS"};
        String str = arrtoString(arr);
        System.out.println(str);
    }
    public static String  arrtoString(String[] arr){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                sb.append(arr[i]).append("-");
            }
            else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
