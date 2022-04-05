package PracticeProgramsForReference.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindSubArraywithSum {
    public static void main(String[] args){
        int[] arr = new int[]{2,4,5,8,9};
        int sum = 13;
        List<Integer> arrList1 = new ArrayList<>();
        List<Integer> arrList2 = new ArrayList<>();

        System.out.println(arrList1.equals(arrList2));
        List<List<Integer>> subArrayList = new ArrayList<>();

//        int temp;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<=arr.length-1; j++){
                int temp = 0;
                temp = arr[i];
//                System.out.println(arr[i]);
                temp = temp + arr[j];
//                System.out.println(arr[j]);
                if(temp == sum) {
                    arrList1.add(arr[i]);
                    arrList1.add(arr[j]);
                    subArrayList.add(arrList1);
                    System.out.println(subArrayList);
                    arrList1.clear();
                }
                subArrayList.clear();
            }
        }
    }
}
