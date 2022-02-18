package Collection.Collection.Set.TestTreeSet;
//自然排序Comparable的使用【应用】
//        - 案例需求
//
//        - 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
//        - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
//   - 实现步骤
//        1. 使用空参构造创建TreeSet集合
//        + 用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
//        2. 自定义的Student类实现Comparable接口
//        + 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
//        3. 重写接口中的compareTo方法
//        + 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
import java.util.TreeSet;

public class TestTreeSet<T> {
    public static void main(String[] args) {
        TreeSet<Test> ts = new TreeSet<>();
        Test s1 = new Test("zhangsan",28);
        Test s2 = new Test("li",27);
        Test s3 = new Test("wangwu",29);
        Test s4 = new Test("zhaoliu",28);
        Test s5 = new Test("qianqi",30);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Test t : ts) {
            System.out.println(t);
        }

    }


}
