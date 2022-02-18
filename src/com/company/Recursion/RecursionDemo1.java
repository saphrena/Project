package Recursion;
/*
递归(自己调用自己)
以编程的角度来看，递归指的是方法定义中调用方法本身的现象
把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算

递归的注意事项：
！！！递归一定要有出口。否则（栈）内存溢出
递归虽然有出口，但是递归的次数也不宜过多。否则内存溢出
* */
public class RecursionDemo1 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        //1- 100之间的和
        //100 + (1-99之间的和)
        // 99 + (1- 98之间的和)
        //....
        //1
        //方法的作用: 求 1- i 之间和
        if(i == 1){
            return 1;
        }else{
            return i + getSum(i -1);
        }
    }
}
