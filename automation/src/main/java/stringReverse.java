public class stringReverse {
    public  static void main(String[] args){
        String str = "Prashant Dilip Sawale";
        String[] reverseArr = str.split(" ");
        for(String strText : reverseArr){
            for(int i = strText.length()-1; i >= 0; i--){
                System.out.print(strText.charAt(i));
            }
            System.out.print(" ");
        }
    }

}
