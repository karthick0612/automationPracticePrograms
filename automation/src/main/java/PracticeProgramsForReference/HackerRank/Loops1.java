package PracticeProgramsForReference.HackerRank;

import java.util.Scanner;

public class Loops1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int N = scanner.nextInt();

        for(int i = 0 ; i <= 10 ; i++){
            int result = N*i;
            System.out.println(N+"*"+i+"="+result);
        }
        scanner.close();
    }
}
