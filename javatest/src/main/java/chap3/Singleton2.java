package chap3;

public class Singleton2 {

    /**
     * 私有构造方法
     */
    private Singleton2(){

    }

    /**
     * 懒汉单例模式
     */
    private static Singleton2 single;

    /**
     * 获取实例
     * @return
     */
    public synchronized static Singleton2 getInstance(){
        if(single==null){
            System.out.println("第一次调用的实例化");
            single = new Singleton2();
        }
        return single;
    }

}
