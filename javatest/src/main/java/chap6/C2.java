package chap6;

public class C2 {

    private String a;

    public C2(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void print(){
        System.out.println("a的类型是："+a.getClass().getName());
    }
}
