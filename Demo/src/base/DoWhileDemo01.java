package base;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        do{
            j=j+i;
            ++i;
        }
        while(i<101);
        System.out.println(j);
    }
}
