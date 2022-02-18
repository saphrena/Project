package Sort;
/*
冒泡排序概述
   数据中相邻的数据进行两两比较，将较大的数据放在后面，小的放前面
   如果有n个数据进行排序，总共需要比较n-1次
   每一次比较完毕，下一次的比较就会少一个数据参与
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        //1 2 3 4 5
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        //外层循环控制的是次数 比数组的长度少一次.
        for (int i = 0; i < arr.length -1; i++) {
            //内存循环就是实际循环比较的
            //-1 是为了让数组不要越界
            //-i 每一轮结束之后,我们就会少比一个数字.
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArr(arr);
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


