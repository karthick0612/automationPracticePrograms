package practicePrograms;

public class stringsSwapwithoutTemp {
    public static void main(String[] args){
        // String Swap without using temporary Variables
        String a = "RestAssuredAutomation";
        String b = "Assured";
//        String str = a.substring(0,6);
        a = a + b;
        System.out.println(a.length() - b.length());
        b = a.substring(0, a.length() - b.length());
//        System.out.println(b.length());
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
