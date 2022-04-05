package PracticeProgramsForReference.ArrayPrograms;

import java.util.Arrays;

public class IntegerArraySort {
    public static void main(String[] args){
        //Printing Array in SingleLine
   //     int[] printArray = new int[]{1, 2, 2, 4, 5, 5, 5, 7, 7};
       // System.out.println(Arrays.toString(printArray));

      //  Sorting Array with temp variable
        int [] arr = new int[]{90,54,9,23,54,212,321,4,4};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int temp = 0;
//                System.out.println(arr[i]);
//                System.out.println(arr[j]);
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //prints the sorted element of the array
//            System.out.print(arr[i]);
//            System.out.println("apple".equals("value"));
        }
        System.out.println(Arrays.toString(arr));
    //    System.out.println(arr[0]);

        //Sorting Array without temp variable
//        int [] arrSort = new int[]{90,54,9,23,54,212,321,4};
//        for (int i = 0; i < arrSort.length; i++)
//        {
//            for (int j = i + 1; j < arrSort.length; j++)
//            {
//                int temp = 0;
//                //System.out.println(arrSort[i]);
//               // System.out.println(arrSort[j]);
//                if (arrSort[i] > arrSort[j])
//                {
//                    arrSort[i] = arrSort[j];
//                  //  arrSort[j] = temp;
//                }
//            }
//            //prints the sorted element of the array
//            System.out.print(arrSort[i]);
        }




    }




