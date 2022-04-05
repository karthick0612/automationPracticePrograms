package PracticeProgramsForReference.InterfaceExample;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public interface TestInterface {
    int value = 10;

    void test1();
    void test2();
    //void test3();
    default void sampleTest2(){
        System.out.println("Karthick Automation Tester");
    }

    // Java 8 Features
    // Using default keyword we can do method implementation in Interface
}