package homePractice;

public class hp_10_Dublicate_Letters {
    public static void main(String[] args) {

/*
            // 1. REVERSE STRING
            // 2. TO FIND DUBLICATE LETTERS AND AMOUNT OF LETTERS
            
        String str = "laliB&elaH";
        for (int i = str.length()-1 ; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
*/

            //TO FIND DUBLICATE LETTERS AND AMOUNT OF LETTERS

        String str1 = "aabbbccdddggrrrwweeeeee";
        String result = "";
        int count = 0;

        for (int i = 0 ; i < str1.length() ; i++) {
            if ( ! result.contains(str1.substring(i,i+1))) {

                result = result + str1.substring(i,i+1);
            }
        }
        for ( int z = 0 ; z < str1.length() ; z++) {
            if (str1.substring(z,z+1).equals("d")) {
                count++;
            }
        }
        System.out.println(result);
        System.out.println("there are " + count + " d");

























    }
}
