/*

//4.2创建不可变集合【理解】
//可变参数应用场景：
//+ 方法介绍
//  + 在List、Set、Map接口中,都存在of方法,可以创建一个不可变的集合
//    + 这个集合不能添加,不能删除,不能修改
//    + 但是可以结合集合的带参构造,实现集合的批量添加
//    + 在Map接口中,还有一个ofEntries方法可以提高代码的阅读性
//    + 首先会把键值对封装成一个Entry对象,再把这个Entry对象添加到集合当中


集合的批量添加：
        首先是通过调用List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数。
        再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。


private static void method1() {
        //集合的批量添加。
        //首先是通过调用List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数。
        //再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。
        ArrayList<String> list3 = new ArrayList<>(List.of("a", "b", "c", "d"));
        System.out.println(list3);
        }



private static void method2() {
        //传递的参数当中，不能存在重复的元素。
        Set<String> set = Set.of("a", "b", "c", "d","a");
        System.out.println(set);
        }



private static void method3() {
        Map<String, String> map = Map.of("zhangsan", "江苏", "lisi", "北京", "wangwu", "天津");
        System.out.println(map);
        }




private static void method4() {
        Map<String, String> map = Map.ofEntries(
        Map.entry("zhangsan", "江苏"),
        Map.entry("lisi", "北京"));
        System.out.println(map);
        }
*/
