package PracticeProgramsForReference.CollectionsPrograms;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapExample {
    public static void main(String[] args){
        Map<String,Integer> hashMapRef = new HashMap<>();
        hashMapRef.put("Karthick",11);
        hashMapRef.put("Testing",22);
        hashMapRef.put("Automation",33);
        hashMapRef.put("Karthick",11);

        System.out.println(hashMapRef);

//        for(String str : hashMapRef.keySet()){
//            System.out.println(hashMapRef.get(str));
//            hashMapRef.put("value",44);
//        }

        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"JAVA");
        concurrentHashMap.put(2,"PYTHON");
        concurrentHashMap.put(3,"PERL");
        concurrentHashMap.put(4,"RUBY");

        for(Integer integer : concurrentHashMap.keySet()){
            System.out.println(concurrentHashMap.get(integer));
            concurrentHashMap.put(5,"Karthick");
            concurrentHashMap.put(4,"RestAssured");
        }

        System.out.println(concurrentHashMap);

        List<String> failSafeList = new ArrayList<>(Arrays.asList("Aa,Bb,Cc,dd,Ee,Ff"));
        System.out.println(failSafeList);

//        for (String str1 : failSafeList){
//            System.out.println(str1);
//            failSafeList.add("Gg");
//        }

        System.out.println(failSafeList);

        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put(" "," ");

        CopyOnWriteArrayList<String> concurrentList = new CopyOnWriteArrayList();
        concurrentList.add("Karthi");
        concurrentList.add("Iniyan");
        for(String st : concurrentList){
            System.out.println(st);
            concurrentList.add("fafa");
        }
        System.out.println(concurrentList);



        Map<Integer,String> countMap = new HashMap<>();
        countMap.put(1,"1");
        countMap.put(2,"s");
        countMap.put(1,"k");

        System.out.println(countMap);

    }
}
