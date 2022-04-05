package PracticeProgramsForReference;

import java.util.*;

public class SampleMain {
    public static void main(String[] args){
//        ParentExample parentExample = new ChildExample();
//        parentExample.testMethod("Karthikc","AutomationTester");
//        parentExample.testMethod();

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        System.out.println("Enter the Number: "+N);
//
//        for(int i = 0 ; i <= 10 ; i++){
//            int result = N*i;
//            System.out.println(N+"*"+i+"="+result);
//        }
//        scanner.close();

//        String str = "Selenium";
//        char[] ch = str.toCharArray();
//        SortedMap<Character,Integer> TreeMap = new TreeMap<>();
//        for(Character ch1 : ch){
//            int count = 1;
//            char ch2 = ch1;
//            if(TreeMap.containsKey(ch2)){
//                TreeMap.put(ch2,count+1);
//            }else{
//                TreeMap.put(ch2,count);
//            }
//        }
//        System.out.println(TreeMap);
//        Collections.sort(TreeMap.size());


//        String str = "automationTester";
//        char[] ch = str.toCharArray();
//        for(int i = 0 ; i <=ch.length-1; i++){
//            int temp = 1;
//            for(int j = 0 ; j<ch.length-1; j++){
//                if(ch[i]==ch[j] && i!=j){
//                    temp++;
//                }
//            }
//            System.out.println(ch[i]+"="+temp);
//        }

        String str1 = "Karthick";
        String str2 = "Tester";

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str1.length());
        System.out.println("After Swap : " + str1 + " " + str2);


//        String a = "RestAssuredAutomation";
//        String b = "Assured";
//        String str = a.substring(0,6);
//        a = a + b;
//        System.out.println(a.length() - b.length());
//        b = a.substring(0, a.length() - b.length());
//        System.out.println(b.length());
//        a = a.substring(b.length());
//        System.out.println(a);
//        System.out.println(b);


        List<String> sampleList = new ArrayList<>();
        sampleList.add("test1");
        sampleList.add("test2");

        for(String str : sampleList){
            System.out.println(str);
        }

    }
}

