package day26_Method_Overloading;

public class warm_Up_Uniques {
/*use the above method to create another called uniques that accepts a string parameter
and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */
            public static void main(String[] args) {
                String str = "ABB";
                String result = "";

                for ( int i = 0 ; i < str.length() ; i++ ) {
                    int num = frequency(str, str.charAt(i));
                    if ( num ==1 ) {
                        result += str.charAt(i);
                    }
                }
                System.out.println(result);

                String str2 = "Cybertek";
                System.out.println(uniques(str2));


            }

            public static String uniques (String str) {
                String result = "";
                for ( int i = 0 ; i < str.length() ; i++ ) {
                    int num = frequency(str, str.charAt(i));
                    if ( num ==1 ) {
                        result += str.charAt(i);
                    }
                }
                return result;
            }


            public static int frequency ( String str, char ch ) {
                char[] arr = str.toCharArray();
                 int count = 0;
                 for ( char each : arr ) {
               if ( each == ch ){
                count++;
              }
           }
              return count;
}






}
