package chap6;

public class Test1 {

    public static void main(String[] args) {
        Demo<Dog> demo = new Demo<Dog>(new Dog());
//        demo.print();
        Dog dog = demo.getOb();
        dog.print();

        Demo<Cat> demo2 = new Demo<Cat>(new Cat());
        Cat cat = demo2.getOb();
        cat.print();

    }
}
