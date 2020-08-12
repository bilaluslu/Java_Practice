package Repl_It;

import java.util.ArrayList;

public class _187_Combine_All {
/*Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
This method should create a new ArrayList of Strings, add all the words (in order)
from wordList1, then add all the words (in order) from wordList2.
In other words, it is combining all the elements from the two parameters.
 */

    public static ArrayList<String> combineAll (ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0 ; i < wordList1.size() ; i++ ) {
            list.add(wordList1.get(i));
        }
        for (int i = 0 ; i < wordList2.size() ; i++ ) {
            list.add(wordList2.get(i));
        }
        return list;

    }





}

