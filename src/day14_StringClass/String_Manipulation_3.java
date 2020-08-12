package day14_StringClass;

public class String_Manipulation_3 {
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = "java";

        System.out.println(str1.equals(str2));              //false
        System.out.println(str1.equalsIgnoreCase(str2));    //true



        String s1 = "Cybertek School";

        boolean b1 = s1.contains("School");      //true
        System.out.println(b1);



        String s3 = "United States";
        System.out.println(  s3.startsWith("U")  );     //true

        //every website has "www." at the beginning of the web address

        String webAddress = "www.amazon.com";
        if (webAddress.startsWith("www.")) {        //true
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }


        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));   //true
        System.out.println(s4.endsWith("School"));  //true


        String email = "bilaluslu@hotmail.com";

        if ( email.endsWith("@gmail.com")) {
            System.out.println("Valid gmail");
        } else {
            System.out.println("Invalid gmail");
        }



















    }
}
