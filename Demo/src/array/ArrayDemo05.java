package array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1, 3}, {2, 3}, {3, 4}, {4, 1}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("{"+array[i][j]+"}"+"\t");
            }
        }
    }
    public static void printArray(int[] arrays){
        for(int i=0;i<arrays.length;i++){
                System.out.print(arrays[i]+"\t");

        }
    }
}
