package PracticeProgramsForReference;

//import org.apache.commons.codec.language.bm.Rule;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sampleProgram {

    public static void main(String[] args){

        String str = "i am an automation engineer i do backend automation i do front end as well";
        String[] strArray = str.split(" ");
        Map<String,Integer> charCountMap = new HashMap<>();
        for(String word : strArray){
//            Pattern pattern = Pattern.compile("\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)");
//            Matcher m = pattern.matcher(c);
//            while(m.find()) {
//                System.out.println(m.group());
//            }

            char[] ch = word.toCharArray();
            for(int i = 0; i < ch.length-1; i++){
                int count = 0;
                for(int j = i + 1 ; j < ch.length-1;j++){
                    if(ch[i] == ch[j]){
                        count++;
                    }
                }
            }
        }
        System.out.println(charCountMap);
    }
}
