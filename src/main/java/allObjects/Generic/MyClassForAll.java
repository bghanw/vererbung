package allObjects.Generic;

public class MyClassForAll<T> {

    T ob;

    MyClassForAll (T ob){
        this.ob = ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }

    //public MyClassForAll() { }
}
