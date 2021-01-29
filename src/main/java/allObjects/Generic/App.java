package allObjects.Generic;

public class App {

    public static void main(String[] args) {


        Pair<Integer, String> pair = new Pair<>(10, "Ten");

        int key = pair.getKey();
        String value = pair.getValue();

        System.out.println(value +" "+ key);




        NumericFns<Integer> iob = new NumericFns<>(6);
        NumericFns<Double> dob = new NumericFns<>(-6.0);

        iob.absEquals(dob);

        System.out.println(iob.absEquals(dob));

        /* NumericFns<Integer> iOb = new NumericFns<>(4);

        System.out.println(iOb.square()); */

       /* MyDouble num = new MyDouble(10.0);
        num.printStuff();

        MyInteger num1 = new MyInteger(15);
        num1.printStuff();

        MyString text = new MyString(" <The Great Deal>");
        text.printStuff();


        MyClassForAll<Integer, Double> obj = new MyClassForAll<>(10, 10.5);
        MyClassForAll<Double, Integer> obj2 = new MyClassForAll<>(20.0, 7);
        MyClassForAll<String, Integer> obj3 = new MyClassForAll<>("Aewsome", 17);

        obj.showType(); */
    }
}
