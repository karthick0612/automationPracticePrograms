package PracticeProgramsForReference.ArrayPrograms;

public class FindSubArray {
    public static void main(String[] args){

        int A[] = {1,2,3};
        int len= A.length;
        for( int i=0; i<len; i++ ){
            for( int j=i; j<len; j++ ){   // Now A[i..j] is the subarray
                for( int k=i; k<=j; k++ ){
                    System.out.print(A[k]);
                }
            }
        }
    }
}
