package allObjects.equals;

import allObjects.toString.Person;

public class Equals {


    public static void main(String[] args) {

        Person p3 = new Person(" David ", 33);

        Person p4 = new Person(" David ", 58);

        if (p3.equals(p4)) {
            System.out.println(p3 +""+ p4);
        }else {
            System.out.println("Names are not the same!");
        }
    }
}
