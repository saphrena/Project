package Collection.Map.TreeMap;


//自然排序
public class Test /*implements Comparable<Test.Test>*/ {
    private String name;
    private int age;

    public Test() {
    }

    public Test(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test.Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (age != test.age) return false;
        return name != null ? name.equals(test.name) : test.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

// 自然排序

//    @Override
//    public int compareTo(@NotNull Test.Test o) {
//        // 按照年龄排序
//       int result = this.getAge() - o.getAge();
//        //次要条件  按姓名
//        result = result==0? this.getName().compareTo(o.getName()):result;
//        return result;

}
