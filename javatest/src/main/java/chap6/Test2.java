package chap6;

public class Test2 {

    public static void tack(Demo<?> a){
        a.print();
    }

    public static void main(String[] args) {
        Demo<Dog> demo = new Demo<Dog>(new Dog());
        tack(demo);

        Demo<Cat> demo2 = new Demo<Cat>(new Cat());
        tack(demo2);
    }
}
