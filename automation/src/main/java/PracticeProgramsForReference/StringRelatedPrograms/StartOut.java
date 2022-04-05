package PracticeProgramsForReference.StringRelatedPrograms;

import java.util.ArrayList;
import java.util.List;

public class StartOut {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "ab*cd";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
            sb.append(str.charAt(i));
        }

//        System.out.println(sb);

        String[] words = new String[]{"xx", "yyy", "x", "yy", "z"};
        int len =2;
        List<String> wordsList = new ArrayList<>();
        for(int i = 0; i < words.length;i++){
            int wordLength = words[i].toCharArray().length;
            if(wordLength != len){
                wordsList.add(words[i]);
            }
        }
        System.out.println(wordsList);
    }
}
