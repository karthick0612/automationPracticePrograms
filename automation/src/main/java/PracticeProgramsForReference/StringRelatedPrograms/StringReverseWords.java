package PracticeProgramsForReference.StringRelatedPrograms;

import java.util.Arrays;
import java.util.Collections;

public class StringReverseWords {
    public static void main(String[] args){
        // String Reverse Word by Word
        String words = "Rest Assured API Automation";

        String words1 = "Rest Assured API Automation";
        String[] value1 = words1.split(" ");
        StringBuilder sb = new StringBuilder(words1.replace(" ",""));
        sb.reverse();

        String[] value = words.split(" ");
        for(int i = value.length-1; i >= 0 ; i--){
//            System.out.println(value[i]);
            int size = value[i].length();
            System.out.println();
        }


        System.out.println(sb);

    }
}
