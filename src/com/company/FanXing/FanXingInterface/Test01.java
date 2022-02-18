package FanXing.FanXingInterface;
// 泛型接口实现类1
//定义实现类时,定义和接口相同泛型,创建实现类对象时明确泛型的具体类型
public class Test01 <T> implements testinterface{


    @Override
    public void show(Object o) {
        System.out.println(o);
    }
}
