package com.fengchuiguo.Prototype;

import java.io.IOException;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Prototype prototype=new Prototype();

        SerializableObject serializableObject=new SerializableObject();
        prototype.setParamint(1);
        prototype.setParamstring("sss");
        prototype.setParamobj(serializableObject);

        Prototype prototype1=prototype.clone();
        Prototype prototype2=(Prototype)prototype.deepClone();

        System.out.println("prototype1==prototype:"+(prototype1==prototype));
        System.out.println("prototype1.equals(prototype):"+prototype1.equals(prototype));

        System.out.println("(prototype1.getParamint()==prototype.getParamint()):"+(prototype1.getParamint()==prototype.getParamint()));

        System.out.println("(prototype1.getParamstring()==prototype.getParamstring()):"+(prototype1.getParamstring()==prototype.getParamstring()));
        System.out.println("(prototype1.getParamstring()).equals(prototype.getParamstring()):"+(prototype1.getParamstring()).equals(prototype.getParamstring()));

        System.out.println("prototype1.getParamobj()==prototype.getParamobj():"+(prototype1.getParamobj()==prototype.getParamobj()));
        System.out.println("(prototype1.getParamobj()).equals(prototype.getParamobj()):"+((prototype1.getParamobj()).equals(prototype.getParamobj())));


        System.out.println("prototype2==prototype:"+(prototype2==prototype));
        System.out.println("prototype2.equals(prototype):"+prototype2.equals(prototype));

        System.out.println("(prototype2.getParamint()==prototype.getParamint()):"+(prototype2.getParamint()==prototype.getParamint()));

        System.out.println("(prototype2.getParamstring()==prototype.getParamstring()):"+(prototype2.getParamstring()==prototype.getParamstring()));
        System.out.println("(prototype2.getParamstring()).equals(prototype.getParamstring()):"+(prototype2.getParamstring()).equals(prototype.getParamstring()));

        System.out.println("prototype2.getParamobj()==prototype.getParamobj():"+(prototype2.getParamobj()==prototype.getParamobj()));
        System.out.println("(prototype2.getParamobj()).equals(prototype.getParamobj()):"+((prototype2.getParamobj()).equals(prototype.getParamobj())));


    }

}
