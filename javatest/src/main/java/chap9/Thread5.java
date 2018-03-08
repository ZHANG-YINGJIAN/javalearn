package chap9;

public class Thread5 implements Runnable{

    public void run() {
        for(int i=1;i<=10;i++){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread5 t = new Thread5();
        Thread t1 = new Thread(t);
        System.out.println("t1是否活动"+t1.isAlive());
        t1.start();
        System.out.println("t1是否活动"+t1.isAlive());

    }
}
