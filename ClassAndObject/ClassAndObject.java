package ClassAndObject;

import Inheritence.D;

public class ClassAndObject {
    public static void main(String args[]){
        A a=new A();
        a.setIntValue(10);
        System.out.println(a.getIntValue());
        B b=new B();
        b.setFloatValue(5.3f);
        System.out.println(b.getFloatValue());
        C c=new C();
        c.setStringValue("Hello");
        System.out.println(c.getStringValue());
        D d=new D();
        d.setIntD(35);
        System.out.println(d.getIntD());

    System.out.println(a.IntValue());
    System.out.println(b.FloatValue());
    System.out.println(c.StringValue());


    }
    
}
