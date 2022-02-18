package Collection.Map.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 案例需求
//- 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
//- 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
public class HashMapTest {
    public static void main(String[] args) {
    HashMap<Test, String> hm = new HashMap<Test, String>();
    Test s1 = new Test("林青霞", 30);
    Test s2 = new Test("张曼玉", 35);
    Test s3 = new Test("王祖贤", 33);
    Test s4 = new Test("王祖贤", 33);


    hm.put(s1,"郑州");
    hm.put(s2,"武汉");
    hm.put(s3,"北京");
    hm.put(s4,"杭州");

    // 遍历第一种：先获取到所有的键，再通过每一个键找对应的值
        Set<Test> keys = hm.keySet();
        for (Test key : keys) {
            String value = hm.get(key);
            System.out.println(key + "-----" + value);
        }

        System.out.println("==========================");

        // 遍历第二种：先获取到所有的键值对对象，再获取到里面每一个键和值对应的值
        // entries前面为泛型嵌套
        Set<Map.Entry<Test, String>> entries = hm.entrySet();
        for (Map.Entry<Test, String> entry : entries) {
            Test key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "-----" + value);
        }

        System.out.println("==========================");


        // 遍历第三种：forEach + lambda表达式
        hm.forEach(
                (Test key, String value)->{
             System.out.println(key + "-----" + value);

                }
        );

    }
}
