package PracticeProgramsForReference.ArrayPrograms;

//import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeastArrayDuplicate {
    public static void main(String[] args){
//        int[] arr = {4,5,3,7,2,1,1,0,3,4,1};
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }

//        List<Integer> sampleList = new ArrayList<>();
//        int[] arr1 = new int[]{1,2,4,2,3,6,4,3,2,1,1,8};
//        for(int i = 0; i < arr1.length-1;i++){
//            for(int j = i + 1; j < arr1.length-1;j++){
//                if(arr1[i] == arr1[j] && !sampleList.contains(arr1[i])){
//                   sampleList.add(arr1[i]);
//                   break;
//                }else if(sampleList.contains(arr1[i])){
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(sampleList);

        int[] arr1 = new int[]{1,2,4,2,3,6,4,3,2,1,1,8};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for(int i = 0; i < arr1.length-1;i++){
//            if(arr1[i] == arr1[i+1]){
//                arr1 = ArrayUtils.remove(arr1,i+1);
//                i--;
//            }

            for(int j = i + 1 ; j < arr1.length-1;j++){
                if(arr1[i] == arr1[j]){
                 //   arr1 = ArrayUtils.remove(arr1,j);
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
