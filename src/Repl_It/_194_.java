package Repl_It;

public class _194_ {

    public static boolean isPalindrome(String check) {

        String reverse = "";
        check = check.replaceAll(" ","");
        for (int i = check.length()-1; i >= 0; i--) {
            reverse += check.charAt(i);
        }

        if( check.equalsIgnoreCase(reverse)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("Nurses Run"));
    }


}
