package Collection.Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        // 比较器排序
        TreeMap<Test, String> tm = new TreeMap<>(new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                int result = o1.getAge() - o2.getAge();
                result=result==0? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });


        Test s1 = new Test("xiaohei",23);
        Test s2 = new Test("dapang",22);
        Test s3 = new Test("xiaomei",22);

        tm.put(s1,"江苏");
        tm.put(s2,"南京");
        tm.put(s3,"河南");

        tm.forEach(
                (Test key,String value)->{
                    System.out.println(key+"-----"+value);

                }
        );
    }
}
