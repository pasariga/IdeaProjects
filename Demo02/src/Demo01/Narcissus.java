package Demo01;

public class Narcissus {
    public static void main(String[] args) {
        //百位
        for(int i=1;i<10;i++){
            //十位
            for(int j=0;j<10;j++){
                //个位
                for(int k=0;k<10;k++){
                    if(Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)==i*100+j*10+k){
                        System.out.print(i*100+j*10+k+" ");
                    }
                }
            }
        }
    }
}
