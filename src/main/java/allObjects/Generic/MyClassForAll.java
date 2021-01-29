package allObjects.Generic;

public class MyClassForAll<T, V> {

    T ob;
    V ob2;

    MyClassForAll (T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    //public MyClassForAll() { }
}
