package PracticeProgramsForReference.CollectionsPrograms;

import java.util.*;

class CollectionsExample {

    public static void main(String[] args) {

        //Integer Sort
        Integer sortIntegers[] = new Integer[] {3,56,2,54,100,567,1,45};
        Arrays.sort(sortIntegers);
        System.out.println(Arrays.toString(sortIntegers));

        //String Sort
        List<String> stringList = Arrays.asList("zzzzz","ttttt","qweeee");
//        Collections.sort(stringList);
//        System.out.println(stringList);

        LinkedList<String> sample = new LinkedList<>();
        sample.add("Karthick");
        sample.add("Java");
        sample.add("Expert");
        sample.add("Automation");
        sample.addFirst("kk1");
        sample.addLast("kk2");
        System.out.println(sample);

        List<Integer> reverserLL = new LinkedList<>();
        reverserLL.add(0);
        reverserLL.add(1);
        reverserLL.add(2);
        Collections.reverse(reverserLL);
        System.out.println(reverserLL);



        Iterator<String> itr = sample.descendingIterator();
        System.out.println(itr);

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");
        arrayList.add("Test4");

        System.out.println(arrayList);
        arrayList.add(3,"kkk");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        Iterator<String> itr1 = arrayList.listIterator(2);
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }


    }
}
