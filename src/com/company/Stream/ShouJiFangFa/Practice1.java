package Stream.ShouJiFangFa;
//案例需求
//
//现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
//- 男演员只要名字为3个字的前三人
//- 女演员只要姓林的，并且不要第一个
//- 把过滤后的男演员姓名和女演员姓名合并到一起
//- 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
//演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
public class Practice1 {
    private String name;
    public Practice1(){
    };

    public Practice1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Practice1{" +
                "name='" + name + '\'' +
                '}';
    }
}


//重写toString方法是为了大于对象属性值，而不是地址值