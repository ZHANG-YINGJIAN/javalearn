package chap9;

public class Test {

    public static void main(String[] args) {
        Music musicThread = new Music();
        Eat eatThread = new Eat();

        musicThread.start();
        eatThread.start();
    }
}
