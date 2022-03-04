package practicePrograms;

public class stringRelatedPrograms {
    public static void main(String[] args){
        String str = "karthick";
        char[] ch = str.toCharArray();
        for(int i = str.length()-1; i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
