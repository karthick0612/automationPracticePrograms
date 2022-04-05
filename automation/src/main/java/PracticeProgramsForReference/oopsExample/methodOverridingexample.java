package PracticeProgramsForReference.oopsExample;

public class methodOverridingexample {

    methodOverridingexample(){
        System.out.println("Parent");
    }

    public void sample(){
        System.out.println("JAVA KARNA");
    }
}

class methodoverridingexample1 extends methodOverridingexample{

    methodoverridingexample1(){
        System.out.println("Child");
    }

    public void sample(){
        System.out.println("Karna Mass");
    }
}

class sample {
    public static void main(String[] args){
//        methodoverridingexample1 m1 = new methodoverridingexample1();
//        m1.sample();

//        methodOverridingexample m2 = new methodOverridingexample();
//        m2.sample();

        methodOverridingexample m3 = new methodoverridingexample1();
        m3.sample();
    }
}

