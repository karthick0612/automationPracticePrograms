package PracticeProgramsForReference.oopsExample;

public abstract class ExampleAbstract {
    int a = 200;
    int b = 100;
    static void test1(){
        System.out.println("RestAssured");
    }

    ExampleAbstract(){

    }

    abstract void sample();
    public void test(){
        System.out.println("Abstraction - Hiding the background details");
    }

}
