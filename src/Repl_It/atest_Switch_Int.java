package Repl_It;

import java.util.ArrayList;

public class atest_Switch_Int {

    public static int[] do_switch(int[] i) {

        int x = i[0];

        i[0] = i[i.length-1];
        i[i.length-1] = x;
        return i;
    }

}
