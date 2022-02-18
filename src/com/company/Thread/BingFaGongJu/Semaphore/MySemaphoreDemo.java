package Thread.BingFaGongJu.Semaphore;

/*
 @李帅朝
 @2022/1/23 023
*/


public class MySemaphoreDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            new Thread(mr).start();
        }
    }
}