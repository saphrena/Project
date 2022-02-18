package FanXing.Practice;
//编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
//训练提示:
//1.在main方法里定义一个引用类型 数组,存放数据,例如: Integer[] a = {1,2,3,4,5,6};
//2.定义泛型方法
//3.泛型方法里进行元素交换
//4.在main方法里,调用泛型方法
//5.打印数组值

    public class Demo1 {
        public static void main(String[] args) {
            Integer[] a = {1,2,3,4,5,6};
            method(a,0,1);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }


        //编写泛型方法
        public static <E> void method( E[] e,int a,int b){
            //元素互换
            E temp = e[a];
            e[a] = e[b];
            e[b] = temp;
        }
    }

