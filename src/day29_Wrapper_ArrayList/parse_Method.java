package day29_Wrapper_ArrayList;

import java.time.LocalDateTime;

public class parse_Method {
    public static void main(String[] args) {

        String str ="123";
        int a1 = Integer.parseInt(str);  //123

        System.out.println(str);    //text
        System.out.println(a1);     //number

        System.out.println(str+1);  // "123"+1  ==> 1231
        System.out.println(a1+1);   // 123 + 1 ==> 124

        byte b1 = Byte.parseByte(str);  // byte 123
        System.out.println(b1); //number
        System.out.println(b1 + 1) ;    // 123+1=124 means it is number

        //Integer I1 = Byte.parseByte(str); gives us compile error Integer only accepts int
        Integer I1 = (int) Byte.parseByte(str); // this one compiles because we assigned byte to int
                                                // this method is autoboxing

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);  //float 10.5 (number)

        double d1 = Double.parseDouble(str2);   // double 10.5 (number)

        String str3 = "32165448961";
        long l1 = Long.parseLong( str3 );   // long 32165448961 (number)

        String str4 = "true";
        boolean bool1 = Boolean.parseBoolean( str4 );   //boolean
        System.out.println( bool1 );    //true
        System.out.println( !bool1 );   //false

        String str5 = "Today is Monday";
        boolean bool2 = Boolean.parseBoolean( str5 );
        System.out.println( bool2 );    // it is not matching "true" or "false" ==> it returns automatically FALSE








    }
}
