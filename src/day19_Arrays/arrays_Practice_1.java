package day19_Arrays;

import java.util.Arrays;

public class arrays_Practice_1 {
    public static void main(String[] args) {

        String[] friends = { "Kuzzat" , "Asiya" , "Saim" , "Akbar", "Marufjon", "Guljannat" , "Murodil" };
        //                       0          1         2        3        4             5           6

        /*
        char[] ch = {'a', 'b'}
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for(int i = 0; i < friends.length ; i++){
            String name = friends[i];
            System.out.println(name);
        }


        System.out.println("===================");


        String[] emails = { "cybertek@yahoo.com" , "asdf@gmail.com" , "cybertek@gmail.com" , "cybertek@hotmail.com" , "cybertek@outlook.com" } ;

        // print out all the users who registered with their gmail

        for ( int i = 0 ; i <= 4 ; i++ ) {

            String email = emails[i];

            //System.out.println("email " + email);

            if ( email.endsWith("@gmail.com") ) {
                System.out.println(email);
            }

        }





















    }
}
