package PracticeProgramsForReference.oopsExample;

public class SingletonClass {

    private SingletonClass(){
        System.out.println("SingleTonClass");
    }

    private static SingletonClass singletonClass = new SingletonClass();

    public static SingletonClass getInstance(){
        return singletonClass;
    }

    public void printSingletonExample(){
        System.out.println("SingletonExample");
    }


}
