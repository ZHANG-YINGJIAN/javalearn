package chap8;

import chap3.Singleton;

import java.util.HashMap;
import java.util.Iterator;

public class TestMap {

    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<String, Student>();
        hashMap.put("1号",new Student("张三",10));
        hashMap.put("2号",new Student("李四",11));
        hashMap.put("3号",new Student("王五",12));

        Student s = hashMap.get("2号");
        System.out.println(s);

        Iterator<String> it = hashMap.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            Student student = hashMap.get(key);
            System.out.println(key+student);
        }
    }
}
