package chap9;

public class Music extends Thread {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("听音乐");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
