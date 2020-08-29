package homePractice.InterviewQuestions;

public class RemoveDuplicate {

    public static String removeDuplicate(String str) {

        String result = "";

        //char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if ( !result.contains( ""+str.charAt(i)) ){
                result += ""+str.charAt(i);
            }

        }

        return result;

    }
    public static void main(String[] args) {

        System.out.println( removeDuplicate("AAABBBBBCC"));
    }



}
