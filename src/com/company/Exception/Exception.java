/*
package Exception;
常见的三个运行期异常：
NullPointerException：空指针异常，运行期异常
ArithmeticException：数学运算异常，运行期异常
ArrayIndexOutOfBoundsException：数组索引越界异常，运行期异常

ParseException：数据转换异常，编译时异常

继承自Exception的自定义异常为编译时异常
继承自RuntimeException的自定义异常为运行时异常 代码中抛出自定义异常的关键字是throw
 */



 /*
编译时异常和运行时异常的区别（记忆）
    - 编译时异常
        - 都是Exception类及其子类
        - 必须显示处理，否则程序就会发生错误，无法通过编译

    - 运行时异常
        - 都是RuntimeException类及其子类
        - 无需显示处理，也可以和编译时异常一样处理

throws和throw的区别
   throws：用在方法声明后面，跟的是异常类名
           表示声明异常，调用该方法有可能会出现这样的异常
   throw：
        用在方法体内，跟的是异常对象名
        表示手动抛出异常对象，由方法体内的语句处理






 ### try-catch方式处理异常（应用）

 - 定义格式

 try {
 可能出现异常的代码;
 } catch(异常类名 变量名) {
 异常的处理代码;
 }


 - 执行流程

  程序从 try 里面的代码开始执行
  出现异常，就会跳转到对应的 catch 里面去执行
  执行完毕之后，程序还可以继续往下执行

        注意
        1. 如果 try 中没有遇到问题，怎么执行？
        会把try中所有的代码全部执行完毕,不会执行catch里面的代码
        2. 如果 try 中遇到了问题，那么 try 下面的代码还会执行吗？
        那么直接跳转到对应的catch语句中,try下面的代码就不会再执行了
        当catch里面的语句全部执行完毕,表示整个体系全部执行完全,继续执行下面的代码
        3. 如果出现的问题没有被捕获，那么程序如何运行？
        那么try...catch就相当于没有写.那么也就是自己没有处理.
        默认交给虚拟机处理.
        4. 同时有可能出现多个异常怎么处理？
        出现多个异常,那么就写多个catch就可以了.
        注意点:如果多个异常之间存在子父类关系.那么父类一定要写在下面




### Throwable成员方法（应用）

- 常用方法

  | 方法名                        | 说明                              |
  | ----------------------------- | --------------------------------- |
  | public String getMessage()    | 返回此 throwable 的详细消息字符串 |
  | public String toString()      | 返回此可抛出的简短描述            |
  | public void printStackTrace() | 把异常的错误信息输出在控制台      |






自定义异常（应用）

+ 自定义异常概述

  当Java中提供的异常不能满足我们的需求时,我们可以自定义异常

+ 实现步骤

  1. 定义异常类
  2. 写继承关系
  3. 提供空参构造
  4. 提供带参构造

+ 代码实现

  异常类

  ```java
  public class AgeOutOfBoundsException extends RuntimeException {
      public AgeOutOfBoundsException() {
      }

      public AgeOutOfBoundsException(String message) {
          super(message);
      }
  }
  ```

  学生类

  ```java
  public class Student {
      private String name;
      private int age;

      public Student() {
      }

      public Student(String name, int age) {
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
              //如果Java中提供的异常不能满足我们的需求,我们可以使用自定义的异常
              throw new AgeOutOfBoundsException("年龄超出了范围");
          }
      }

      @Override
      public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  '}';
      }
  }
  ```

  测试类

  ```java
  public class ExceptionDemo12 {
      public static void main(String[] args) {
          // 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
          // 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。

          Student s = new Student();

          Scanner sc = new Scanner(System.in);
          System.out.println("请输入姓名");
          String name = sc.nextLine();
          s.setName(name);
         while(true){
             System.out.println("请输入年龄");
             String ageStr = sc.nextLine();
             try {
                 int age = Integer.parseInt(ageStr);
                 s.setAge(age);
                 break;
             } catch (NumberFormatException e) {
                 System.out.println("请输入一个整数");
                 continue;
             } catch (AgeOutOfBoundsException e) {
                 System.out.println(e.toString());
                 System.out.println("请输入一个符合范围的年龄");
                 continue;
             }
             /*if(age >= 18 && age <=25){
                 s.setAge(age);
                 break;
             }else{
                 System.out.println("请输入符合要求的年龄");
                 continue;
             }*/
/*

}
                 System.out.println(s);

                 }
                 }
 */
