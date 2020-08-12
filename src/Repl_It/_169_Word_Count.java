package Repl_It;

public class _169_Word_Count {
/*
This method gets a string and returns the word count of that string.
example:
wordCount("foo bar")
returns 2
wordCount("one two three")
returns 3
wordCount("bla")
returns 1
hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
    public static int wordCount(String words) {

        String[] c = words.split(" ");
        int a = c.length;

        return a;
    }

    public static void main(String[] args) {
        int b = wordCount("three");
        System.out.println(b);
    }



}
