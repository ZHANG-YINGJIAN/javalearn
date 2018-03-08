package chap9;

public class Thread6 implements Runnable{

    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName()+":"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread6 t = new Thread6();
        Thread t1 = new Thread(t);
        t1.start();

    }
}
