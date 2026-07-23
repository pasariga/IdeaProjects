package array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //创建一个二位数组11*11，0：无，1：黑，2：白
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 1;
        System.out.println("输出原始数组：");
        for (int i = 0; i < array1.length; i++) {
            for (int anInt : array1[i]) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        //获取有效值的个数
        System.out.println("=============");
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数："+sum);
        //创造稀疏数组
        int[][] array2 = new int[sum + 1][3];
        array2[0][0]=1;
        array2[0][1]=1;
        array2[0][2]=sum;
        //遍历，将非零值存放稀疏数组中
        int count = 0;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                if(array1[i][j]!=0)
                {
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }
        System.out.println("稀疏数组");
        for(int i = 0; i <array2.length; i++){
            System.out.print(array2[i][0]+"\t"
            +array2[i][1]+"\t"
            +array2[i][2]+"\t");
        }
    }


}
