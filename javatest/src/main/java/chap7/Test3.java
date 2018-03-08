package chap7;

import java.lang.reflect.Constructor;

public class Test3 {

    public static void main(String[] args) {

        Class<?> c=null;
        try {
            c=Class.forName("chap7.Student");//反射得到整个Class类的结构
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Student s = null;
        Constructor<?>[] cons=c.getConstructors();
        try {
//            s=(Student) c.newInstance(); //利用Class对象重新创建一个实例
            s = (Student)cons[0].newInstance("zhang",18);//利用Class调用类的构造方法
        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        s.setName("小锋");
//        s.setAge(28);
        System.out.println(s);
    }
}
