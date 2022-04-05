package PracticeProgramsForReference;

import java.lang.reflect.Method;

public class PrintStringandIntArrary {

//    public void printArray(Object[] array) {
//        for (Object obj : array) {
//            System.out.println(obj);
//        }
//    }

    public static void arrayIteration(Object array[]){
        for(Object obj : array){
            System.out.println(obj);
        }
    }

    public static void main(String[] args){
//        Integer[] intArray = { 1, 2, 3 };
//        String[] stringArray = {"Hello", "World"};
//        printArray(intArray);
//        printArray(stringArray);

       // for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if(name.equals("printArray"))
//                count++;
//        }

//        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        arrayIteration(intArray);
        arrayIteration(stringArray);

        Integer[] intArray1 = { 1, 2, 33 };
        // Find how many numbers in two digits
        // Convert to String and find the length

        // 100 , 500, 10
        // Retain ALL in HashSet

//        myPrinter.printArray(intArray);
//        myPrinter.printArray(stringArray);
//        int count = 0;
//
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if(name.equals("printArray"))
//                count++;
//        }
//        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
