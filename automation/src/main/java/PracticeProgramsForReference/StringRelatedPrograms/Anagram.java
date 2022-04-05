package PracticeProgramsForReference.StringRelatedPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String str1 = "Rest";
        String str2 = "Rtes";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        //Arrays.sort(ch1);
        Arrays.sort(ch2);
        Boolean isAnagram = Arrays.equals(ch1,ch2);
//        if(isAnagram){
//            System.out.println("Anagram");
//        }else{
//            System.out.println("Not Anagram");
//        }

        String s1 = "karthick";
        String s2 = "tkarhikc";

        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        if(s3.length == s4.length){
            for(int i = 0 ; i < s3.length-1 ; i++){
                for(int j = 0 ; j < s4.length-1 ; j++){
                    if(s3[i]==(s4[j])){

                    }
                }
            }
        }else{
            System.out.println("Not Anagram");
        }
    }
}
