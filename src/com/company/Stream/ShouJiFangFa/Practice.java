package Stream.ShouJiFangFa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        /*
        //需求1：得到名字为3个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

        //需求2：把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for(String name : names) {
            System.out.println(name);
        }
        */

        //创建Set集合对象
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        /*
        //需求3：得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);

         Stream<Integer> setStream = set.stream().filter(age -> age > 25).collect(Collector.toSet());
          system.out.println(setStream);

        //需求4：把使用Stream流操作完毕的数据收集到Set集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for(Integer age : ages) {
            System.out.println(age);
        }
        */
        //定义一个字符串数组，每一个字符串数据由姓名数据和年龄数据组合而成
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        //需求5：得到字符串中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
            // parseInt 字符串变int类型

        list.stream().filter(
                (String s)->{
                    String[] split = s.split(",");
                    int age = Integer.parseInt(split[1]);
                    return age >=24;
                }
        ).collect(Collectors.toMap(
                (String s)->{
                    return s.split(",")[0];
                },
                (String s)->{
                    return Integer.parseInt(s.split(",")[1]);
                }
        ));

//当参数职业一个时，数据类型，小括号可简化
// 当方法体值一行时，分号、return、大括号可简化

//        .collect(Collectors.toMap(
//                s->s.split(",")[0],
//                s->Integer.parseInt(s.split(",")[1]) ));

        //需求6：把使用Stream流操作完毕的数据收集到Map集合中并遍历，字符串中的姓名作键，年龄作值
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
