package PracticeProgramsForReference.ArrayPrograms;

import java.util.Arrays;

public class arraySortAndSum {
    public static void main(String[] args){
        int[] arr = new int[]{6,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length-1;j++){
                int temp = 0;
                sum = arr[j-i] + arr[j];
                // sum = sum + arr[j+1];
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
        int a = arr.length-1;
        System.out.println(a);
    }

}
