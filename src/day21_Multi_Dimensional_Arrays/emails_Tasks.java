package day21_Multi_Dimensional_Arrays;

public class emails_Tasks {
    public static void main(String[] args) {
/*given an array:
String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
 elements could be more in the array
print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for ( String eachEmails : emails ) {
            if ( !eachEmails.endsWith("@gmail.com") ) {
                System.out.println(eachEmails);
            }
        }

        System.out.println("======================");

        for ( String eachEmails : emails ) {
            if ( eachEmails.endsWith("@gmail.com") ) {
                continue;
            }
            System.out.println(eachEmails);
        }

















    }
}
