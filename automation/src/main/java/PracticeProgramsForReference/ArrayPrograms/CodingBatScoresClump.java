package PracticeProgramsForReference.ArrayPrograms;

public class CodingBatScoresClump {
    public static void main(String[] args){
        int[] scores = new int[]{3, 4, 6};
        Boolean isRepeated = false;
        for(int i = 0; i < scores.length-1;i++){
            int sum = scores[i+1] - scores[i];
            if(sum == 0 || sum == 1){
                isRepeated = true;
                break;
            } else{
                isRepeated = false;
            }

        }
//        System.out.println(isRepeated);

        String str = "kkk";
        String str1 = new String("kkk");
        System.out.println(str==str1);
        System.out.println(str.equals(str1));



    }
}
