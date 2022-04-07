package PracticeProgramsForReference.integerArrayPrograms;

public class CommonTwo {
    public static void main(String[] args){
        String[] a = {"a", "a", "b", "b", "c"};
        String[] b = {"a", "b", "b", "b", "c"};
        int value = commonTwo(a,b);
        System.out.println(value);

    }
    public static int commonTwo(String[] a, String[] b) {
        int count1 = 0;
        for(int i = 0 ; i<=a.length-1; i++){
            int count = 0;
            for(int j = 0 ;j<=b.length-1; j++){
                if(a[i]==b[j] && count==0){
                    count++;
                    b[j] = null;
                }
            }
            if(count!=0){
                count1++;
            }
        }
        return count1;
    }
}
