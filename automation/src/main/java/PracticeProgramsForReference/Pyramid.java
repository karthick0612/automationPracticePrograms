package PracticeProgramsForReference;

public class Pyramid {
    public static void main(String args[]) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//         output:
//         *
//         **
//         ***
//         ****
//         *****

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //output
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int i = 10; i > n; i--) {
            System.out.print(" ");
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
