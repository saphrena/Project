package Thread.Thread;

/*
 @李帅朝
 @2022/1/21 021
*/

public class MyRunable implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<=100;i++){
            System.out.println(i);
        }
    }
}
