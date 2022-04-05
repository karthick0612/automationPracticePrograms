package PracticeProgramsForReference;

public class PrintStrings {
    public static void main(String[] args){
        String str = "asferd456hyjk34dss";
        char[] ch = str.toCharArray();

        // Solution 1
        for(int i = 0 ; i < ch.length; i++){
            // Solution 1;
            Boolean flag = Character.isDigit(ch[i]);
            if(flag)
                System.out.println(ch[i] + "is a number");
            else
                System.out.println(ch[i] + "is a Character");



        }

        // Solution 2
        for(int i = 0; i < str.length();i++){
            Boolean flag1 = Character.isDigit(str.charAt(i));
            if(flag1) {
                System.out.println("'"+ str.charAt(i)+"' is a number");
            }
            else {
                System.out.println("'"+ str.charAt(i)+"' is a letter");
            }
        }
    }
}
