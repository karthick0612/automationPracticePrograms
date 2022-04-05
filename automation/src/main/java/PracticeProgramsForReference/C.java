package PracticeProgramsForReference;

public class C {
    public static void main(String[] args) {
        B a = new B();
        a.methodB("karthick");
    }

}

    class A {
        A(){
            System.out.println("Invoking Parent Constructor");
        }
        void methodA(){
            System.out.println("Parent");
        }
    }

    class B extends A{
        String str = "Kk";
        void methodB(String str){
            System.out.println(str);
        }

    }


