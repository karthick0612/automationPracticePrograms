package PracticeProgramsForReference.StringRelatedPrograms;

public class PrintCharacterSequence {

    public static void main(String[] args){
            String str1 = "the";
            StringBuilder stringBuilder = new StringBuilder("");
            char[] ch = str1.toCharArray();
            for(Character ch1 : ch){
                str1 = ch1.toString() + ch1.toString();
                stringBuilder.append(ch1.toString() + ch1.toString());
            }
            System.out.println(stringBuilder);
    }

    // output:
//    doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"

}
