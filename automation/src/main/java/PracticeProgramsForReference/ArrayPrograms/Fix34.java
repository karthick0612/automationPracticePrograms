package PracticeProgramsForReference.ArrayPrograms;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args){
        returnIntArray returnIntArray = new returnIntArray();
        int[] nums = new int[]{1, 3, 2, 8, 4, 5, 3, 7};
        nums = returnIntArray.returnIntA(nums);
//        System.out.println(Arrays.toString(nums));

        int [] arr = new int[]{1, 3, 2, 8, 4, 5, 3, 7};
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 3 ){
                for(int j = i+1 ; j < arr.length; j++){
                    if(arr[j]==4 && arr[j-1]!=3){
                        int temp = arr[i+1];
                        arr[i+1] = arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//            for (int j = i + 1; j < arr.length; j++)
//            {
//                int temp = 0;
//                System.out.println(arr[i]);
//                System.out.println(arr[j]);
//                if (arr[i] == 3)
//                {
//                    temp = arr[j];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
    }
}

class returnIntArray{
    public int[] returnIntA(int[] nums){
        //int[] intArray = new int[]{nums};
        int temp = 0;
        for(int i = 0 ; i < nums.length-1; i++){
            for(int j = i+1; j< nums.length-1;j++){
                if(nums[i] ==3 && nums[j]==4){
                    nums[i+1] = nums[j];
                }
            }
        }
        return nums;
    }
}
