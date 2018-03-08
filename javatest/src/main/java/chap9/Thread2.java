package chap9;

public class Thread2 implements Runnable{

    private int baoZi=1;

    private String threadName;

    public Thread2(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while(baoZi<=10){
            System.out.println(threadName+"吃第"+baoZi+"个包子");
            baoZi++;
        }
    }

    public static void main(String[] args) {
        Thread2 t1 = new Thread2("张三线程");
        Thread2 t2 = new Thread2("李四线程");

        Thread t11 = new Thread(t1);//实例化一个Thread，并传入一个class实例
        Thread t12 = new Thread(t2);

        t11.start();
        t12.start();
    }
}