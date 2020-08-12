package day13_StringClass;

public class String_Literals {
    public static void main(String[] args) {

        String str1 = "Cat";   //String pool
        String str2 = new String("Cat");     // Java Heap

        System.out.println(str1 + " : " + str2);    // same output

        System.out.println(str1 == str2);           // output is false because they are NOT same object
        String str3 = "Cat";

        System.out.println(str1 == str3);   // same output so there is only one object created
                                            // in String pool because we declared same String for different
                                            //variable

        String str4 = new String("Cat");

        System.out.println(str2 == str4);   //once we create new String means that they are two
                                            //independent object

        String s1 = "Java";        //String pool, immutable we cannot modify it
        s1 = "Javascript";          //new object will be created in memory

        System.out.println(s1);     //output is Javascript

        String s2 = "Java";         // NO new object will be created in the memory

        System.out.println(s1 == s2);   //they are NOT same anymore output is FALSE












    }
}
