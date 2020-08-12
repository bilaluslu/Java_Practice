package Repl_It;

public class _174_First_Char {
    /*
    The method gets a string and returns a string minus the first letter.
for example:
removeFirst("aaa")
returns "aa"
     */
    public static String removeFirst(String target) {

        target = target.substring(1);
        return target;
    }

    public static void main(String[] args) {
        System.out.println(removeFirst("asdf"));

    }


}
