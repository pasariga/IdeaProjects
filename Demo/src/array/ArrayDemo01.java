package array;

public class ArrayDemo01 {
    //变量的类型 变量的名字 = 变量的值
    //数组类型

    public static void main(String[] args){
    int[] nums;//1.定义
    nums = new int[10];//这里面可以存放10个int类型的数组
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        //计算所有元素的和
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.print(sum);
    }
}
