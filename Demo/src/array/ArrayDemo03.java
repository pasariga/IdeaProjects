package array;

public class ArrayDemo03 {
    public static void main(String[] args){
       int[] arrays={1,2,3,4,5};
       //打印全部数组元素
       for(int i=0;i<arrays.length;i++) {
           System.out.println("数组"+i+":"+arrays[i]);
       }
           System.out.println("=========");
       //计算所以元素和
           int sum=0;
           for(int i=0;i<arrays.length;i++){
               sum+=arrays[i];
           }
           System.out.println("和："+sum);
        System.out.println("=========");
        //查找最大元素
        int max=arrays[0];//不能让max=0，若数组的值都<0，则不行
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]>max){
                max=arrays[i];
            }
        }
        System.out.println("最大为："+max);

    }
}
