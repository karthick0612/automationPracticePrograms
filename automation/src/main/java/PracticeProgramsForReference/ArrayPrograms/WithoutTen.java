package PracticeProgramsForReference.ArrayPrograms;

import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args){
        int[] nums = new int[]{10, 13, 10, 14, 10};
//        for(int i  = 0; i < nums.length-1; i++){
//            int temp = 0;
//            if(nums[i] == 10 || nums[i]==0) {
//                temp = nums[i];
//                nums[i] = nums[i+1];
//                nums[i+1] = 0;
//            }
//        }

        for(int i  = 0; i < nums.length-1; i++){
            if(nums[i] == 10){
                for(int j = 0; i < nums.length-1;j++){
                    int temp = 0;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[i+1] = 0;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
