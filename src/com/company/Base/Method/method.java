/*
构造方法和成员方法的区别

1.构造方法
     构造方法作用概述
        给对象的数据进行初始化
        构造方法格式
        方法名与类名相同
        没有返回值类型，连void都没有
        没有具体的返回值

     构造方法注意事项
        如果你不提供构造方法，系统会给出默认构造方法
        如果你提供了构造方法，系统将不再提供
        构造方法也是可以重载的
        注意：定义类的时候，建议自己添加无参的构造方法。

2.成员方法

     成员方法作用概述

        表示对象所具有的功能（和行为）。
        成员方法格式
        有返回类型，可以为void类型，也可以是基本数据类型或引用类型。
        成员方法名可以和类名相同，也可以不同。

3.构造方法和成员方法的区别
        A:格式区别
        构造方法和类名相同，并且没有返回类型，也没有返回值。
        普通成员方法可以任意起名，必须有返回类型，可以没有返回值。
        B:作用区别
        构造方法用于创建对象，并进行初始化值。
        普通成员方法是用于完成特定功能的。
        C:调用区别
        构造方法是在创建对象时被调用的，一个对象建立，只调用一次相应构造函数
        普通成员方法是由创建好的对象调用，可以调用多次
*/
