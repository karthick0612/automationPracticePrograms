package PracticeProgramsForReference;

public class Value {
    public static void main(String[] args){
//        String av = "Karthick";
//        System.out.println(av.hashCode());
//        av = av.concat("kumar");
//        System.out.println(av.hashCode());
//        System.out.println(av);

//        StringBuffer str = new StringBuffer("Karthick");
//        System.out.println(str.hashCode());
//        System.out.println(str.append("value"));
//
//        System.out.println(str.hashCode());
//
//        Integer val = new Integer("123131");
//        System.out.println(val);

//        ExampleAbstract obj = new Abstract1();

        value1 value1 = new value1();
        value1 value11 = new value1("fda");
        value1.print();

    }
}

class value1{
    value1(){
        System.out.println("Karthick");
    }

    value1(String str){
        System.out.println(str);
    }
    void print(){
        System.out.println("KK");
    }
}


