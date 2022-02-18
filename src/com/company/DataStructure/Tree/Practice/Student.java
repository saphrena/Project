package DataStructure.Tree.Practice;

public class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;
    private int english;


    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }


    @Override
    public java.lang.String toString() {
        return "Student{" +
                "name=" + name +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}' + "---总分为" + getSum();
    }

    @Override
    public int compareTo(Student o) {
        // 主要条件: 按照总分进行排序
        int result = o.getSum() - this.getSum();
        // 次要条件: 如果总分一样,就按照语文成绩排序
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        // 如果语文成绩也一样,就按照数学成绩排序
        result = result == 0 ? o.getMath() - this.getMath() : result;
        // 如果总分一样,各科成绩也都一样,就按照姓名排序
        result = result == 0 ? o.getName().compareTo(this.getName()) : result;
        return result;
    }
//   遍历规则：先获取左边，再获取中间，再获取右边 ， 所以打印结果 从小到大
//   o-this  从大到小
//   this-o  从小到大


    private int getSum() {
        return chinese + this.math + this.english;
    }
}
