package PracticeProgramsForReference.integerArrayPrograms;

public class CornerSumIntegerArray {

    public static void main(String[] args){
        int sum = 3;
        int[] arr = {10,20,30,40,50};
        int[] arr1;
        int total = 0;
        for(int i = 0; i<arr.length-1; i++){
            int[] sum1;
            total = arr[i] + arr[arr.length-1];
            arr[i] = arr[i+1];
            if(total!=0){

            }
        }
        System.out.println(total);
    }
}
