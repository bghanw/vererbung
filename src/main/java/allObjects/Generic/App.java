package allObjects.Generic;

public class App {

    public static void main(String[] args) {


        MyDouble num = new MyDouble(10.0);
        num.printStuff();

        MyInteger num1 = new MyInteger(15);
        num1.printStuff();

        MyString text = new MyString(" <The Great Deal>");
        text.printStuff();


        MyClassForAll<Integer> obj = new MyClassForAll<>(10);
        MyClassForAll<Double> obj2 = new MyClassForAll<>(20.0);
        MyClassForAll<String> obj3 = new MyClassForAll<>("Aewsome");

        obj.showType();
        obj2.showType();
        obj3.showType();
    }
}
