package day44_Exceptions;
/*
testCase:
    step1
    step2
    step3
    step4
    ...
    step10
    without handling each step we canNOT go further

 */
public class ExceptionHandling {
    public static void main(String[] args) {

        String str = "Cybertek";

        try{
            System.out.println(   str.charAt(100)   );
            System.out.println("Try block");
        } catch (RuntimeException e){
            String discription = e.getMessage();
            System.out.println(discription);
        }
        System.out.println("=================");

        try{
            System.out.println(   10 / 0   );   // unchecked exception
        } catch (ArithmeticException e) {
            String description = e.getMessage();
            System.out.println( description );
        }


        System.out.println("Completed");

    }
}
