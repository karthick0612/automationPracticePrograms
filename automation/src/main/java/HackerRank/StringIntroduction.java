package HackerRank;

public class StringIntroduction {


    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "JAVA";

        System.out.println(str1.length()+str2.length());
        System.out.println(str1.compareTo(str2)>0?"Yes":"No");
        System.out.println(str1.substring(0, 1).toUpperCase()+str1.substring(1, str1.length())+" "+str2.substring(0, 1).toUpperCase()
                +str2.substring(1, str2.length()));


    }
}
