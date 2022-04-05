package PracticeProgramsForReference.oopsExample;

public class OOPSExampleMain {
    public static void main(String[] args){
        methodOverriding1 m1 = new methodOverriding1();
        m1.methodOverridingExample();

        // Instance created for Abstract Class - if we are creating instance, abstract methods to be overridden
        ExampleAbstract exampleAbstract = new ExampleAbstract() {
            @Override
            void sample() {
                System.out.println("Tester");
            }
        };

        exampleAbstract.sample();
        exampleAbstract.test();

        ExampleAbstract ex = new AbstractImplementationReference();
        ex.sample();
        ex.test();

        AbstractImplementationReference abstractImplementationReference = new AbstractImplementationReference();
        abstractImplementationReference.sample();
        abstractImplementationReference.test();
        ExampleAbstract.test1();

        SingletonClass ex1 = SingletonClass.getInstance();
        ex1.printSingletonExample();



    }
}
