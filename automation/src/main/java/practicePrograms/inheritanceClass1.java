package practicePrograms;

public class inheritanceClass1 {
    public void inherit(){
        System.out.println("Inheritance class 1 - Method 1");
    }

   static {
       System.out.println("Static Block1");
   }

}

class inheritanceClass2 extends inheritanceClass1 {
    public void inherit(){
        System.out.println("Inheritance class 2 - Method 2");
    }

    inheritanceClass2(String name){
        System.out.println("Implementing Constructor");
        System.out.println(name);
    }
}

class inheritanceClass3  {
    public static void main(String[] args){
        inheritanceClass2 inheritanceClass2 = new inheritanceClass2("Constructor Implementation");

    }
}


