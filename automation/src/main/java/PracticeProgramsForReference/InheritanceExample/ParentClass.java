package PracticeProgramsForReference.InheritanceExample;

import java.util.Arrays;

public class ParentClass {

    ParentClass(){
        System.out.println("Invoke Constructor");
    }
    private int a = 10;
    String str = "Karthick Automation Tester";
    protected void compareString(){
        System.out.println(Arrays.stream(str.split(" ")).count());
        System.out.println(a);
    }

}

class ChildClass extends ParentClass{
    ChildClass(){
        super();

    }

    protected void printValues(){
        System.out.println(super.str);
    }
}

class InheritanceMain{
    public static void main(String[] args){
        ParentClass parentClass = new ChildClass();
        ChildClass childClass = new ChildClass();
//        parentClass.printValues(); //
        parentClass.compareString();
        childClass.printValues();
    }
}