package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaInttoString {
    public static void main(String[] args){

//        int n = 100;
//        String s = String.valueOf(n);
//        System.out.println(s);
//
//        String str = Integer.toString(n);
//        System.out.println(str);
//
//        if (n == Integer.parseInt(s)) {
//            System.out.println("Good job");
//        } else {
//            System.out.println("Wrong answer.");
//        }

//        String str1 = "karthickkreyt";
//        String str2 = new String("Automation");

//        char[] arr = str1.toCharArray();
//
//        for(int i = arr.length-1 ; i >= 0; i--){
//            System.out.print(arr[i]);
//        }]
//        int count;
//        Map<Character,Integer> stringCounts = new HashMap<>();
//        char[] arr = str1.toCharArray();
//        for(int i = 0 ; i <= arr.length-1 ; i++){
//            System.out.println(arr[i]);
//            count = 1;
//            for(int j = 1 ; j <= arr.length-1; j++){
//                System.out.println(arr[j]);
//                if(arr[i]==arr[j]){
//                    stringCounts.put(arr[i],count++);
//                }
//                else {
//                    stringCounts.put(arr[i],count);
//                }
//            }
//        }
//        System.out.println(stringCounts);

//        List<Character> characterList = new ArrayList<>();
//        count = 1;
//        for(int i = 0 ; i <= arr.length-1 ; i++){
//            if(characterList.contains(arr[i])){
//                characterList.add(arr[i]);
//                stringCounts.put(arr[i],count++);
//            }
//            else{
//                characterList.add(arr[i]);
//                stringCounts.put(arr[i],count++);
//            }
//        }
//        System.out.println(stringCounts);

        String str1 = "kkfa131242ff";
        char[] arr = str1.toCharArray();

        for(int i = arr.length-1 ; i >= 0; i--){
            System.out.print(arr[i]);
        }

        for(Character ch : arr){
            System.out.println(ch);
        }



    }
}
