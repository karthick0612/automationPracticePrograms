package PracticeProgramsForReference.ArrayPrograms;

public class ReturnEvenInteger {

    public static void main(String[] args){
    }


    public int countEvens(int[] nums) {
        int num=0;
        for(Integer intA: nums){
            if(intA%2==0){
                num++;
            }
        }
        return num;
    }
}


