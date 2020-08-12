package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {


        //System.out.println(  9 / 0  );  // unchecked exceptions, there is NO compile error
                                        // but it is logically wrong, gives arithmetic exception

        String str = "Cybertek";

        //System.out.println( str.charAt(-1));    // it does NOT compile error but there is no negative index number
                                            // so it is String index out of bound exception

        int[] arr = {2,5,3};

        //System.out.println( arr[6] );   // it does NOT compile error but there is index number 6
                                        // so it is array index out of bound exception


        System.out.println(  "test completed ");


    }
}
