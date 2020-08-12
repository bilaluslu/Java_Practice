package homePractice;

public class hp_01_Replace_Num_To_Letter {
    public static void main(String[] args) {

/*  write a program which prints out the number from 1 to 30:
1. for numbers which are divisible by 3, print "HA" instead of number
2. for numbers which are divisible by 5, print "LE" instead of number
3. for numbers which are divisible by both 3 or 5, print "HALE" instead of number
do not use for loop             1 2 HA 4 LE 6 .....
 */

        String str = "";
        int i = 1;
        while ( i <= 30 ) {

            if ( i % 3 == 0 && i % 5 == 0 ) {
                str += "HALE ";
            } else if ( i % 3 ==0 ) {
                str += "HA ";
            } else if ( i % 5 == 0 ) {
                str += "LE ";
            } else {
                str += i + " ";

            }
            i++;
        }
        System.out.print(str);










    }
}
