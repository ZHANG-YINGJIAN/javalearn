package chap4;

public class Test {

    public static void testFinally(){
        String str="123a";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("exception");
            return;
        }finally{
            System.out.println("finally end");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        testFinally();
    }
}
