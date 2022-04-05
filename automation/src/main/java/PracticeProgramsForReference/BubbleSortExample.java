package PracticeProgramsForReference;

import java.util.Arrays;

public class BubbleSortExample {

    //Big O n^2
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    // int arr[] = {64, 34, 25, 12, 22, 11, 90};
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    int temp = arr[j];//64
                    arr[j] = arr[j+1];//34 -
                    arr[j+1] = temp;
                }
    }



    public void printArray(int arr[])
    {
        int n = arr.length;
        System.out.println(Arrays.asList(arr.toString()));
        Arrays.stream(arr).forEach(System.out::print);

        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
