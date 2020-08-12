package day21_Multi_Dimensional_Arrays;

public class warm_Up_Longest_Shortest_Word {
    public static void main(String[] args) {
/*write a program that can return the logest string of text from an array
write a program that can return the shortest string of text from an array
 */
        String[] names = { "Reem" , "Omer" , "Muhtar" , "Emrah" , "Muhammed" , "Ana" };

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for ( int i = 0 ; i < names.length ; i++ ) {
            if ( names[i].length() > maxLengthString ) {
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
        }
        System.out.println(longestWord);

        for ( int i = 0 ; i < names.length ; i++ ) {
            if ( names[i].length() < minLengthString ) {
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }
        System.out.println(shortestWord);



    }
}
