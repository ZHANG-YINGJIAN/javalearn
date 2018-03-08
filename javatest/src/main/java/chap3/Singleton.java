package chap3;

public class Singleton {

    /**
     * 私有构造方法
     */
    private Singleton(){

    }

    /**
     * 饿汉单例模式
     */
    private static final Singleton single = new Singleton();

    /**
     * 获取实例
     * @return
     */
    public static Singleton getInstance(){
        return single;
    }

}
