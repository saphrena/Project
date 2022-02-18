package Thread.Thread;

/*
 @李帅朝
 @2022/1/21 021
*/public class TEST {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        Thread t1 = new Thread(mr);
        t1.start();
    }
}
