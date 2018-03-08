package chap8;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {

        /**
         * 1 无序
         * 2 不可重复
         */

        HashSet<String> hs = new HashSet<String>();
        hs.add("21221");
        hs.add("112");
        hs.add("312");
        hs.add("421");
        hs.add("312");

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"");
        }
    }
}
