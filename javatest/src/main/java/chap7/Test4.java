package chap7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c=Class.forName("chap7.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor<?> cons[] = c.getConstructors();
        for(Constructor<?> con:cons){
            System.out.println("构造方法："+con);
        }

        Method mds[] = c.getMethods();
        for(Method m:mds){
            System.out.println(m);
        }

        Field fs[]=c.getDeclaredFields();
        for(Field f:fs){
            System.out.println(f);
        }
    }
}
