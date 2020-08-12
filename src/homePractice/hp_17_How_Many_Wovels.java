package homePractice;

public class hp_17_How_Many_Wovels {
    public static void main(String[] args) {

        String wovels = "a eieiocnw a ufqedfqrehvb a a a ef";

        int count = 0;
        for ( int i = 0 ; i<wovels.length() ; i++ ) {

            switch (wovels.charAt(i)){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    count++;
            }

        }System.out.println(count);




    }
}
