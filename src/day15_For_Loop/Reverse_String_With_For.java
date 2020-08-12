package day15_For_Loop;

public class Reverse_String_With_For {
    public static void main(String[] args) {

        String str = "Java";

        int lastIndexNumber = str.length()-1;

        for ( int i = lastIndexNumber ; i >= 0 ; i-- ) {
            System.out.print(str.charAt(i));
        }








    }
}
