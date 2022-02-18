package Stream.ShouJiFangFa;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Practice1Test {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        /*
        //男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);

        //女演员只要姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);

        //把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> stream = Stream.concat(manStream, womanStream);

        //把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
//        stream.map(Practice1::new).forEach(System.out::println);
        stream.map(Practice1::new).forEach(p -> System.out.println(p.getName()));
        */

        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3),
                        womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Practice1::new).
                forEach(p -> System.out.println(p.getName()));
    }
}
//          Stream.concat(stream1,stream2).forEach(name ->{
//              Practice1 practice = new Practice(name);
//              sout(practice);
//              });