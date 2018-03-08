package chap9;

public class Thread8 implements Runnable{

    private int baoZi=1;

    private String threadName;

    public Thread8(String threadName) {
        this.threadName = threadName;
    }

/*    public void run() {
        *//**
         * 同步块
         *//*
        synchronized (this){
            while(baoZi<=5){
                System.out.println(threadName+"吃第"+baoZi+"个包子");
                baoZi++;
            }
        }
    }*/

    public void run() {

        while(baoZi<=5){
            /**
             * 同步块
             */
            synchronized (this){
                if(baoZi<=5){
                    System.out.println(threadName+"吃第"+baoZi+"个包子");
                }
                baoZi++;
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 多线程共享数据 避免争抢问题 用同步锁synchronized
         */
        Thread8 t1 = new Thread8("线程共享");

        Thread t11 = new Thread(t1);//实例化一个Thread，并传入一个class实例
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }
}