package PracticeProgramsForReference.StringRelatedPrograms;

public class CountTheWords {
    public static <Char> void main(String[] args){
        String str = "abchihi";
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0; i<ch.length-1;i++){
            String string1 = Character.toString(ch[i])+Character.toString(ch[i+1]);
            if(string1.equalsIgnoreCase("hi")){
                count++;
            }
        }
        System.out.println(count);
    }


//    public boolean scoresIncreasing(int[] scores) {
//        Boolean isScoreIncreasing = false;
//        for(int i = 0; i < scores.length-1;i++){
//            if(scores[i+1]) > scores[i]){
//                isScoreIncreasing = true;
//            }else{
//                isScoreIncreasing = false;
//            }
//        }
//        return isScoreIncreasing;
//    }
}
