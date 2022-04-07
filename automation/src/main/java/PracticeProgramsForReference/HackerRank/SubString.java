package PracticeProgramsForReference.HackerRank;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int k=sc.nextInt();
        String max=a.substring(0,k);
        String min=a.substring(0,k);

        for(int i=0; i+k<=a.length(); i++){
            if(a.substring(i, i+k).compareTo(min)<0) min=a.substring(i, i+k);
            if(a.substring(i, i+k).compareTo(max)>0) max=a.substring(i, i+k);
        }

        System.out.println(min);
        System.out.println(max);



    }
}
