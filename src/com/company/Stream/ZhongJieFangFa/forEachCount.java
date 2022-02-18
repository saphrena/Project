package Stream.ZhongJieFangFa;

import java.util.ArrayList;
import java.util.function.Consumer;

//- 概念
//  终结操作的意思是,执行完此方法之后,Stream流将不能再执行其他操作
//
//- 常见方法
//  | 方法名                        | 说明                     |
//  | ----------------------------- | ------------------------ |
//  | void forEach(Consumer action) | 对此流的每个元素执行操作 |
//  | long count()                  | 返回此流中的元素数       |
public class forEachCount {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //需求1：把集合中的元素在控制台输出
//        list.stream().forEach(System.out::println);


        //lambda表达式格式
        list.stream().forEach(
                (String s)->{
                    System.out.println(s);
                }
        );


        // 匿名内部类形式
//void foreach( Consumer action):对此流的每个元素执行操作
//Consumer 接口中的方法 void accept(T  t):对给定的参数执行此操作
//在 foreach方法的底层,会循环获取到流中的每一个数据
//并循环调用 accept方法,并把每一个数据传递给 accept方法
//s就依次表示了流中的每一个数据
//所以,我们只要在 accept方法中,写上处理的业务逻辑就可以了
        list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );


        //需求2：统计集合中有几个以张开头的元素，并把统计结果在控制台输出
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);

        long count1 = list.stream().count();
        System.out.println(count1);
    }

}
