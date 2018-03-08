package chap8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class TestArrayList {

    private static void printArrayList(ArrayList<String> arrayList) {
        System.out.print("当前集合元素：");
        for(int i=0;i<arrayList.size();i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        printArrayList(arrayList);
        arrayList.add(1,"校长三");
        printArrayList(arrayList);
        arrayList.set(2,"小李四");
        printArrayList(arrayList);
        arrayList.remove(2);
        printArrayList(arrayList);

    }
}
