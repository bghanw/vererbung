package allObjects.Generic;

public class NumericFns <T extends Number> {

    T num;

    NumericFns (T ob){

        this.num = ob;
    }



    public boolean absEquals(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return  false;
    }

    //abs mean absloute Value

    /*

    T ob;

    NumericFns (T ob){

        this.ob = ob;
    }

    public double square (){
        return ob.intValue() * ob.doubleValue();
    } */




}
