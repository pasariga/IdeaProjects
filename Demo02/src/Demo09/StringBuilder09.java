package Demo09;

public class StringBuilder09 {
    public static void main(String[] args) {
        String[] names={"Tom","Jack","Lucy"};
        String s = joinNames(names);
        System.out.println(s);

    }
    public static String joinNames(String[] names){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<names.length;i++){
            sb.append(names[i]).append(",");
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();


    }
}

