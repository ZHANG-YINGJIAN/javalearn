package chap7;

import java.lang.reflect.Method;

public class Test5 {

    public static void main(String[] args) {

        Class<?> c = null;
        try {
            c=Class.forName("chap7.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Object obj = c.newInstance();
            Method m1 = obj.getClass().getMethod("setName",String.class);
            m1.invoke(obj,"xiaofeng");

            Method m2 = obj.getClass().getMethod("getName");
            String name = (String)m2.invoke(obj);
            System.out.println("name:"+name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
