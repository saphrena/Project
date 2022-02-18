package Thread.BingFaGongJu.Semaphore;

/*
 @李帅朝
 @2022/1/23 023
*/

// **实现步骤 :
//  1，需要有人管理这个通道
//
//  2，当有车进来了，发通行许可证
//
//  3，当车出去了，收回通行许可证
//
//  4，如果通行许可证发完了，那么其他车辆只能等着

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {
    //1.获得管理员对象，
    private Semaphore semaphore = new Semaphore(2);
    @Override
    public void run() {
        //2.获得通行证
        try {
            semaphore.acquire();
            //3.开始行驶
            System.out.println("获得了通行证开始行驶");
            Thread.sleep(2000);
            System.out.println("归还通行证");
            //4.归还通行证
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
