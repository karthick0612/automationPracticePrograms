package PracticeProgramsForReference.collectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        Set<String> testSet = new HashSet<>();
        testSet.add("karthick");
        testSet.add("karthick");
        System.out.println(testSet.size());
    }
}
