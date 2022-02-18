package Sort;
// 二分查找前提条件，数组内的元素一定要按照大小顺序排列，如果没有大小顺序，是不能使用二分查找法的
/*
* 实现步骤
1. 定义两个变量，表示要查找的范围。默认min = 0 ，max = 最大索引**
2. 循环查找，但是min <= max**
3. 计算出mid的值
4. 判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引**
5. 如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找**
6. 如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找**
7. 当min > max 时，表示要查找的元素在数组中不存在，返回-1.
* */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int num = 11;

        //1,我现在要干嘛? --- 二分查找
        //2.我干这件事情需要什么? --- 数组 元素
        //3,我干完了,要不要把结果返回调用者 --- 把索引返回给调用者
        int index = BinarySearchForIndex(arr,num);
        System.out.println(index);
    }
    private static int BinarySearchForIndex(int[] arr, int num) {
        //1,定义查找的范围
        int min = 0;
        int max = arr.length -1;
        //2.循环查找 min <= max
        while(min<=max){
            //3.计算出中间位置 mid
            int mid = (min+max) /2; // >>1 也表示除以2
            //mid指向的元素 > number
            if(arr[mid] > num){
                //表示要查找的元素在左边.
                max = mid -1;
            }else if (arr[mid] < num){
                //mid指向的元素 < number
                //表示要查找的元素在右边.
                min = mid +1;
            }else{
                //mid指向的元素 == number
                return mid;
            }
        }
        //如果min大于了max就表示元素不存在,返回-1.
        return -1;
    }
}
