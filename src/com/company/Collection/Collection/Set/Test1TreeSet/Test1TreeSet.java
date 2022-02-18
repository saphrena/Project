package Collection.Collection.Set.Test1TreeSet;

//- 案例需求
//
//        - 存储老师对象并遍历，创建TreeSet集合使用带参构造方法
//        - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
//
//   - 实现步骤
//
//        - 用TreeSet集合存储自定义对象，带参构造方法使用的是比较器排序对元素进行排序的
//        - 比较器排序，就是让集合构造方法接收Comparator的实现类对象，重写compare(T o1,T o2)方法
//        - 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写

import java.util.Comparator;
import java.util.TreeSet;
// public TreeMap(Comparator<? super K> comparator)构造一个新的，空的树图，按照给定的比较器排序。
// 插入到地图中的所有键必须由给定的比较器相互比较
public class Test1TreeSet {
    public static void main(String[] args) {
        TreeSet<Test1> ts = new TreeSet<>(new Comparator<Test1>() {
            @Override
            public int compare(Test1 o1, Test1 o2) {
                //o1表示现在要存入的那个元素
                //o2表示已经存入到集合中的元素
                int result = o1.getAge() - o2.getAge();
                result=result==0? o1.getName().compareTo(o2.getName()): result;
                return result;
            }
        });

        Test1 t1 = new Test1("zhangsan",23);
        Test1 t2 = new Test1("lisi",22);
        Test1 t3 = new Test1("wangwu",24);
        Test1 t4 = new Test1("zhaoliu",24);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        System.out.println(ts);
    }

}
