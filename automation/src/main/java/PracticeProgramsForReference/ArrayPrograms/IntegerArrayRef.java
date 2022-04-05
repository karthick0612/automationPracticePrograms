package PracticeProgramsForReference.ArrayPrograms;

import java.util.Arrays;
import java.util.Vector;

public class IntegerArrayRef {
    public static void main(String args[]){
        int[] arr = {54,50,60,1,70,10,20,30,40,99};
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        String str = "Karthick";
        int s = str.length();
        System.out.println(s);
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        Vector<String> kk = new Vector<>();
        System.out.println(kk.isEmpty());

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = arr[arr.length-1] + arr[arr.length-2] ;
        System.out.println(sum);
    }
}

