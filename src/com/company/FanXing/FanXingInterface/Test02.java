package FanXing.FanXingInterface;
// 泛型接口实现类2
// 定义实现类时,直接明确泛型的具体类型
public class Test02 implements testinterface{

    @Override
    public void show(Object o) {
        System.out.println(o);
    }
}
