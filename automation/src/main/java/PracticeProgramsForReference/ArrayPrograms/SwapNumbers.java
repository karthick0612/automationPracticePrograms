package PracticeProgramsForReference.ArrayPrograms;

public class SwapNumbers {

    public static void main(String args[]){
        long first = 324142112412412L;
        long second = 243242134141400L;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println(first);
        System.out.println(second);

        long temp = first;
        first = second;
        second = temp;

        System.out.println(first);
        System.out.println(second);

    }
}
