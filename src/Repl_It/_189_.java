package Repl_It;

public class _189_ {

    public static boolean isError(String line) {

        if (line.startsWith("error")) {
            return true;
        }else {
            return false;
        }

    }
}
