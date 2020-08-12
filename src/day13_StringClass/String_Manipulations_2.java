package day13_StringClass;

public class String_Manipulations_2 {
    public static void main(String[] args) {


        //substring(beginning value, ending index) method: crates substring of the
        // string value from the beginnng index till the ending index
        String str = "Cybertek School is the best";
        //            0123456789...
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 01234567891011
        String firstName;
        String lastName;

        firstName = fullName.substring(0,5+1);
        lastName = fullName.substring(7,11+1);
        System.out.println(firstName);
        System.out.println(lastName);

        String s1 = "I love Java Programming Language";
        //           01234567

        String className = s1.substring(7);

        System.out.println(className);


        String s2 = "I like C# Programming C# C#";
        s2 =   s2.replace("C#", "Java" );

        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("18", "19");

        System.out.println(name);


        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");

        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");

        System.out.println(r2);

















    }
}
