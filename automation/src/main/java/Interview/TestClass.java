package Interview;

import java.util.Date;

public class TestClass {

    public static void main(String[] args){
        // Current Date to Addition of Two days
        // Current Date to Sub of Two days
        // Date Input Given Wrong(BVA)
        // Month Input given wrong(BVA)
        // Year Input given Wrong

        String date = "10-03-2022";
        Boolean isDateValid = returnValidDate(date);

    }

    static Boolean returnValidDate(String date){
        String[] dateArray = date.split("-");
        if(dateArray[0].equals("") ){

        }
        return false;
    }

   // static void
}
