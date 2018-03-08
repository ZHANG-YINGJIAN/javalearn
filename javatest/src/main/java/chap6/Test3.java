package chap6;

public class Test3 {

    /**
     * 泛型方法
     * @param t
     */
    public static <T> void f(T t){
        System.out.println("T的类型是："+t.getClass().getName());
    }

    public static void main(String[] args) {
        f("");
        f(1);
        f(1.0f);
        f(new Object());
    }
}
