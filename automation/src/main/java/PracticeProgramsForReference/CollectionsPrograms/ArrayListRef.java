package PracticeProgramsForReference.CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRef {
    public static void main(String args[]){
        java.util.List<String> list1 = new ArrayList<>(Arrays.asList("AAA","BBB","CCC"));
        java.util.List<String> copylist = new ArrayList<>(list1);
        java.util.List<String> list2 = new ArrayList<>(Arrays.asList("BBB","CCC","DDD"));

        list1.removeAll(list2);
        System.out.println(list1); //will have not contains value

        copylist.removeAll(list1);
        System.out.println(copylist); //will have the contains value
    }
}
