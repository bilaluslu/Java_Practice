package homePractice;

import java.util.Scanner;

public class hp_09_Email_And_Password {
    public static void main(String[] args) {

  /*      String str = "       Java is fun programming language    ";
        str = str.replace("Java" , "C++").trim().toUpperCase();
        System.out.println(str);

        String A1 = "Batch 18 is a great batch a cool also";
        int num = A1.indexOf("g");
        System.out.println(num);
        int num2 = A1.indexOf("a g");
        System.out.println(num2);

        String str = "Batch 18 is a great batch a cool also";
        int n1 = str.indexOf("co");
        int n2 = str.lastIndexOf(" a");
        String str2 = str.substring(n1,n2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(str2);

        String str = "";
        boolean n1 = str.isEmpty();
        System.out.println(n1);

        String s1 = "JaVA";
        String s2 = new String("java");
        System.out.println( s1 == s2 );                 //false
        System.out.println( s1.equals(s2) );            //false
        System.out.println( s1.equalsIgnoreCase(s2) );  //true

        String name = "Bilal";
        boolean result = name.contains("Ali");
        System.out.println(result);                 //false
        boolean result2 = name.contains("il");
        System.out.println(result2);                //true

        String Today = "Java";
        boolean r1 = Today.startsWith("J");
        System.out.println(r1);
        boolean r2 = Today.endsWith("g");
        System.out.println(r2);
*/

        //EMAIL PASSWORD PROBLEM

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String user = scan.nextLine();
        System.out.println("Enter your password");
        String pass = scan.nextLine();

        String username = "cybertek.batch12@gmail.com";
        String password = "Javengers";

        if (user.endsWith("@gmail.com")) {
            if (user.equalsIgnoreCase(username) && pass.equals(password)) {
                System.out.println("Logged in succesfully");
            } else {
                System.out.println("Invalid username or password");
            }
        } else {
            System.out.println("It's not a valid email address");
        }






    }
}













