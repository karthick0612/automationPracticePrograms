package PracticeProgramsForReference.HackerRank;

import java.util.Scanner;

public class EndOfFile {
    public void main(String[] args){

        Scanner scan = new Scanner(System.in);
        for(int i = 1; scan.hasNext()== true; i++){
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
