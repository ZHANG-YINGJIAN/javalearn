package chap6;

public class CC<T> {

    private T o;

    public CC(T o) {
        this.o = o;
    }

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    public void print(){
        System.out.println("T的类型是："+o.getClass().getName());
    }
}
