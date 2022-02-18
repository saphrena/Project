package Sort;
/*
+ 快速排序概述
  冒泡排序算法中,一次循环结束,就相当于确定了当前的最大值,也能确定最大值在数组中应存入的位置
  快速排序算法中,每一次递归时以第一个数为基准数,找到数组中所有比基准数小的.再找到所有比基准数大的.
小的全部放左边,大的全部放右边,确定基准数的正确位置
注意：一次递归找到基准数所在位置，左边都比他小，右边都比他大，但左右边具体顺序不
+ 核心步骤
  1. 从右开始找比基准数小的
  2. 从左开始找比基准数大的
  3. 交换两个值的位置
  4. 红色继续往左找，蓝色继续往右找，直到两个箭头指向同一个索引为止
  5. 基准数归位
*/
public class QuickSort {
    public static void main(String[] args) {
//        1，从右开始找比基准数小的
//        2，从左开始找比基准数大的
//        3，交换两个值的位置
//        4，红色继续往左找，蓝色继续往右找，直到两个箭头指向同一个索引为止
//        5，基准数归位
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quiteSort(arr,0,arr.length-1);  // 后两个参数为排序范围

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {
        // 递归结束的条件
        if(right < left){
            return;
        }

        int left0 = left;
        int right0 = right;  // 用于基准归位

        //计算出基准数
        int baseNumber = arr[left0];

        while(left != right){
//        1，从右开始找比基准数小的
            while(arr[right] >= baseNumber && right > left){
                right--;
            }
//        2，从左开始找比基准数大的
            while(arr[left] <= baseNumber && right > left){
                left++;
            }
//        3，交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        // 递归调用自己,将左半部分排好序
        quiteSort(arr,left0,left-1);
        // 递归调用自己,将右半部分排好序
        quiteSort(arr,left +1,right0);

    }
}
