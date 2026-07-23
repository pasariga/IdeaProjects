package base;

public class ForDemo03 {
    public static void main(String[] args) {
        //用while或for循环输出0到1000内能被5整除的数，并且每行输出三个
        for(int i = 0; i <=1000; i++){
            if(i%5==0)
            {
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0)
            {
                System.out.println();
            }
        }

    }
}
//println输出完换行
//print输出完不换行