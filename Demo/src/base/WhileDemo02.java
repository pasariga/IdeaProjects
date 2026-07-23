package base;

public class WhileDemo02 {
    static void main() {
        int i=0;
        int j=0;
        while(i<101){
            j=j+i;
            ++i;
        }
        System.out.println(j);

    }
}
