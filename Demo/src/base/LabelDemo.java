package base;

public class LabelDemo {
    public static void main(String[] args) {
        outer:for(int i = 0; i < 100; i++) {
        for(int j = i+1; j < 10; j++) {
            if(i%j==0){
                continue outer;
            }
System.out.print(i+"\t");
        }
        }
    }
}
