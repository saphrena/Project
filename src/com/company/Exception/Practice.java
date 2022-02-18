package Exception;

/*需求
        键盘录入学生的姓名和年龄,其中年龄为18 - 25岁,超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止

        + 实现步骤

        1. 创建学生对象
        2. 键盘录入姓名和年龄，并赋值给学生对象
        3. 如果是非法数据就再次录入*/


// 学生类

public class Practice {
    private String name;
    private int age;

    public Practice() {
    }

    public Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 25){
            this.age = age;
        }else{
            //当年龄不合法时,产生一个异常
            throw new RuntimeException("年龄超出了范围");
        }
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


