package chap9;

public class Thread1 extends Thread{

    private int baoZi=1;

    private String threadName;

    public Thread1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while(baoZi<=10){
            System.out.println(threadName+"吃第"+baoZi+"个包子");
            baoZi++;
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("张三线程");
        Thread1 t2 = new Thread1("李四线程");

        t1.start();
        t2.start();
    }
}
