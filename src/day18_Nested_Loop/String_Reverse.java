package day18_Nested_Loop;

public class String_Reverse {
    public static void main(String[] args) {

        String str= "Javaavava" ;
        String rev = "";
        int lastIndex = str.length()-1;

        do {

            rev += str.charAt(lastIndex);

            lastIndex--;

        } while ( lastIndex >= 0 );

        System.out.println(rev);































    }
}
