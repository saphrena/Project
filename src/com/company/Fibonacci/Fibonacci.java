package Fibonacci;
/*
斐波那契数列（fibonacci）是指这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
这个数列从第3项开始，每一项都等于前两项之和。请使用递归知识，求数列第20项的值。
*/
public class Fibonacci {
    public static void main(String[] args) {
        int num = fibonacci(20);
        System.out.println(num);
    }

    public static int fibonacci(int n) {
        // 前两项已知 -- 出口
        if (n == 1 || n == 2) {
            return 1;
        }
        // 从第三项，等于前两项的和 -- 规律
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
