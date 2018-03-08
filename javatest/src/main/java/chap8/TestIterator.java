package chap8;

import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {

    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        list.add(new Student("张三",10));
        list.add(new Student("李四",11));
        list.add(new Student("王五",12));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
        }
    }
}
