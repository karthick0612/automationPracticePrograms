package PracticeProgramsForReference.StringRelatedPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumInStringUsingRegEx {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("\\d+");
//        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        Matcher m = p.matcher("string1234more567string890");
        while(m.find()) {
            System.out.println(m.group());
        }

        String str2 = "karth6ick4234324";
        str2 = str2.substring(0,6);
        System.out.println(str2);
        String str1 = str2.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2.matches("^[a-zA-Z]*$"));
    }
}
