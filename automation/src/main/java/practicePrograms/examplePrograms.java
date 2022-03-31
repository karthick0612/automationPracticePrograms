package practicePrograms;

public class examplePrograms {
    public static void main(String[] args){
        System.out.println("Main method");
        method();
    }

    static {
        System.out.println("Static Block");
    }

    public static void method(){
        System.out.println("Static Method");
    }
}
