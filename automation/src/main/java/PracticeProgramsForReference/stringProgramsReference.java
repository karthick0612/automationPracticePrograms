package PracticeProgramsForReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringProgramsReference {

    public static void main(String[] args){


        // String Reverse
        String str1 = "kkfa131242ff";
        char[] arr = str1.toCharArray();
        for(int i = arr.length-1 ; i >= 0; i--){
            System.out.println(arr[i]);
        }

        // String Reverse Word by Word
        String words = "Rest Assured API Automation.";
        String[] value = words.split(" ");
        for(int i = value.length-1; i >= 0 ; i--){
            System.out.println(value[i]);
        }

        //Idenify Numbers and Duplicate Character count
        String stringValue = "karr4thick0612automationtester";
        char[] stringValueCharacters = stringValue.toCharArray();
        List<Character> duplicateCount = new ArrayList<>();
        Map<Character,Integer> duplicateCountMap = new HashMap<>();
        int count = 1;
        for(int i = 0; i <= stringValueCharacters.length-1; i++){
            if(duplicateCountMap.keySet().contains(stringValueCharacters[i])){
                duplicateCountMap.put(stringValueCharacters[i],duplicateCountMap.get(stringValueCharacters[i])+1);
            }else{
                duplicateCountMap.put(stringValueCharacters[i],count);
            }
        }
        System.out.print(duplicateCountMap);

        //For Loop
        for(Character ch : stringValue.toCharArray()){
            if(duplicateCountMap.keySet().contains(ch))
                duplicateCountMap.put(ch,duplicateCountMap.get(ch)+1);
            else
                duplicateCountMap.put(ch,count);
        }
        System.out.println(duplicateCountMap);

        // Find Numbers in Strings
        String str2 = "srinivasan3241413";
        Map<Character,String> numberMap = new HashMap<>();
        for(Character ch : str2.toCharArray()){
            Boolean Flag = Character.isDigit(ch);
            if(Flag)
                numberMap.put(ch,"Number");
            else
                numberMap.put(ch,"Character");
        }
        System.out.println(numberMap);

        // Using Regex Find Numbers in String - It will return true
        System.out.println(str2.matches("^[a-zA-Z]*$"));

        //Find Numbers in a String Using Regular Expression
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("string1234more567string890");
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
