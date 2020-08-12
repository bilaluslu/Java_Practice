package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        System.out.println(   obj.defaultAccess  );
        System.out.println(   obj.publicAccess   );
        // System.out.println(   obj.SSN   );  // private: only accessible in the SAME CLASS

    }
}
