package chap7;

public class Test2 {
    public static void main(String[] args) {

        Class<?> c=null;
        try {
            c=Class.forName("chap7.Student");//得到Class对象
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Student s = null;
        try {
            s = (Student)c.newInstance();//利用Class对象重新创建一个实例
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        s.setName("小锋");
        s.setAge(28);
        System.out.println(s);
    }
}
