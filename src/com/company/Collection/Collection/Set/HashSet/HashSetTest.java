package Collection.Collection.Set.HashSet;
// 案例需求
//- 创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
//- 要求：学生对象的成员变量值相同，我们就认为是同一个对象
import java.util.HashSet;
// 如果HashSet集合要存储自定义对象，那么必须重写HashCode和equals方法
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Test> hs = new HashSet<>();

        Test s1 = new Test("李李李",23);
        Test s2 = new Test("帅帅帅",23);
        Test s3 = new Test("朝朝朝",24);

        Test s4 = new Test("朝朝朝",24);


        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Test t : hs) {
            System.out.println(t);

        }

    }
}
