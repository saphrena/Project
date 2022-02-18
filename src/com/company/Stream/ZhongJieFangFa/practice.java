package Stream.ZhongJieFangFa;
// 将1.。。。10中只保留偶数，遍历集合
import java.sql.SQLOutput;
import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            list.add(i);
        }

      list.stream().filter(number -> number %2==0).forEach(number -> System.out.println(number));

        System.out.println("===================");

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
//Stream流中无法直接修改集合，数组等数据源中的数据
