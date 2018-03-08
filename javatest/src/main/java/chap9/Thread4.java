package chap9;

public class Thread4 implements Runnable{

    public void run() {
        for(int i=1;i<=10;i++){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread4 t = new Thread4();

        new Thread(t).start();//匿名对象
        new Thread(t).start();
        new Thread(t,"张三线程").start();
    }
}
