package com.sonena.practice;

import org.junit.Test;

public class ExampleInstanceTest {
    @Test //Reference Parent type but object is child
    public void tesValidInstanceOf() {
        ExampleInstanceOf exInOf = new ExampleInstanceEx2();
        if (exInOf instanceof ExampleInstanceOf) {
            System.out.println("exInOf is instanceof Parent");
        } else
            System.out.println("exInOf is not an instance of Parent");
    }

    @Test //parent object not an instance of Child
    public void tesValidParentToParentInstanceOf() {
        ExampleInstanceOf exInOf = new ExampleInstanceOf();
        if (exInOf instanceof ExampleInstanceEx2) {
            System.out.println("exInOf is instanceof Parent");
        } else
            System.out.println("exInOf is not an instanceof Parent");
    }

    @Test //child object referring to child
    public void tesInValidParentToParentInstanceOf() {
        ExampleInstanceEx2 exInOf = new ExampleInstanceEx2();
        if (exInOf instanceof ExampleInstanceEx2) {
            System.out.println("exInOf is instanceof Parent");
        } else
            System.out.println("exInOf is not an instanceof Parent");
    }

    @Test //paren object referring to child
    public void tesParentInstanceOf() {
        ExampleInstanceEx2 exInOf = new ExampleInstanceEx2();
        ExampleInstanceOf parent = exInOf;

        if (parent instanceof ExampleInstanceEx2) {
            System.out.println("exInOf is instanceof Parent , " + ((ExampleInstanceEx2) parent).getA());
            System.out.println("exInOf is instanceof Parent , " + parent.getA());
            System.out.println("exInOf is instanceof Parent , " + exInOf.getA());
        } else
            System.out.println("exInOf is not an instanceof Parent");
    }

    @Test //paren object referring to child
    public void tesAccessControl() {
        ExampleInstanceEx2 childInst = new ExampleInstanceEx2();
        System.out.println("exInOf is instanceof Parent , " + childInst.getA()); //100

        ExampleInstanceOf parentIns = new ExampleInstanceOf();
        System.out.println("exInOf is instanceof Parent , " + parentIns.getA());//10

        //Reference Type Parent ,object is type of child
        ExampleInstanceOf parentIns2 = new ExampleInstanceEx2();
        System.out.println("exInOf is instanceof Parent geta , " + parentIns2.getA()); //10

        //ExampleInstanceEx2 childInst2 = new ExampleInstanceOf(); cannot create reference type child to parent object

        parentIns = childInst;
        System.out.println("exInOf is instanceof Parent , " + parentIns.getA()); //10


    }

}
