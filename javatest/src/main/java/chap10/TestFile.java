package chap10;

import java.io.File;

public class TestFile {

    public static void listFile(File file){
        if(file!=null){
            if(file.isDirectory()){ //是目录
                System.out.println(file); //打印目录
                File files[] = file.listFiles(); //遍历目录
                if(files!=null){
                    for(int i=0;i<files.length;i++){
                        listFile(files[i]);  // 递归调用
                    }
                }
            }else{   //是文件
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("E://project//ajax");
        listFile(file);
    }
}
