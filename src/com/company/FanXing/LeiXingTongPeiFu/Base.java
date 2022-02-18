//- 类型通配符: <?>
//
//        - ArrayList<?>: 表示元素类型未知的ArrayList,它的元素可以匹配任何的类型
//        - 但是并不能把元素添加到ArrayList中了,获取出来的也是父类类型
//
// - 类型通配符上限限定: <? extends 类型>
//
//        - ArrayListList <? extends Number>: 它表示的类型是Number或者其子类型
//
// - 类型通配符下限限定: <? super 类型>
//
//        - ArrayListList <? super Number>: 它表示的类型是Number或者其父类型



//eg：     Integer 继承于 number  又继承于  Object
/*
public class GenericDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        method(list4);

        getElement1(list1);
        getElement1(list2);//报错
        getElement1(list3);
        getElement1(list4);//报错

        getElement2(list1);//报错
        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
    }

    // 泛型通配符: 此时的泛型?,可以是任意类型
    public static void method(ArrayList<?> list){}
    // 泛型的上限: 此时的泛型?,必须是Number类型或者Number类型的子类
    public static void getElement1(ArrayList<? extends Number> list){}
    // 泛型的下限: 此时的泛型?,必须是Number类型或者Number类型的父类
    public static void getElement2(ArrayList<? super Number> list){}

}


 */