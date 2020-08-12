package Resources;

import day39_AccessModifiers.AccessModifier;

public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        //System.out.println(  obj.defaultAccess  );  // default is only accessible in the same package
                                                     // outside the package it gives error

        System.out.println(  obj.publicAccess  ); // public is always visible, open the world

        //System.out.println(   obj.SSN   );  // only accessible in the SAME CLASS


    }
}
