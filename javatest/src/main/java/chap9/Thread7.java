package chap9;

public class Thread7 implements Runnable{

    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(100);
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName()+":"+i);
                if(i==5){
                    System.out.println("线程礼让");
                    thread.yield();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread7 t = new Thread7();
        Thread t1 = new Thread(t,"线程A");
        Thread t2 = new Thread(t,"线程B");
        Thread t3 = new Thread(t,"线程C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
