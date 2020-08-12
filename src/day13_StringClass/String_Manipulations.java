package day13_StringClass;

public class String_Manipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
                    //01234567

        //to find which char it is
        char ch1 = str.charAt(5);
        System.out.println(ch1 == 'A');         //output is false
        System.out.println(ch1 == 'T');         //output is false case sensivity
        System.out.println(ch1);                //output is 't'

        //to find length of String
        int totalLength = str.length();
        System.out.println(totalLength);        //output is 8
        System.out.println(totalLength < 250 ); //output is true

        String str2 = "Today is great day, Java is Fun";
                     //012345678.....
        int maxIndexNum = str2.length()-1;  //to find max index num we must minus ONE from lenght
        System.out.println(maxIndexNum);

        //to concats to given value to String
        String s1 = "Cybertek";
        s1.concat(" School");
        System.out.println(s1);     //output is Cybertek
        System.out.println(s1.concat( " School" ));   //output is Cybertek School

        String s2 = "Java";
        s2 = s2.concat(" is a programming language");
        System.out.println(s2);     //output is Java is a programming language

        // toLowerCase() method, converts all character to lower case
        String name1 =  "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);      //output is "cybertek"

        // toUpperCase() method, converts all character to upper case
        String name2 =  "cybertek";
        name2 = name2.toLowerCase();
        System.out.println(name2);      //output is "CYBERTEK"

        // trim() method, used for  removing unused spaces
        String A1= "       Today is a great day";   //numch of space before Today
        A1 = A1.trim();     // this method remove sppaces
        System.out.println(A1);












    }
}
