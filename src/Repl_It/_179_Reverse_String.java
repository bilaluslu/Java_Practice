package Repl_It;

public class _179_Reverse_String {
    /*
    reverse method reverse a string.
it gets a string and returns it in reverse.
for example:
reverse("foo") ==> "oof"
reverse("student") ==> "tnedust"

     */
    public static String reverse(String input) {

        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reverse("asdfasdf"));
    }






}
