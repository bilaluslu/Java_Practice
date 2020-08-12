package day24_Methods;

public class string_Reverse {
    public static void main(String[] args) {

        reverse("cybertek");
        String name = reverse2("cybertekschool");
        System.out.println(name);
    }

    public static void reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

        public static String reverse2(String str) {
            String reverse = "";

            for ( int i = str.length()-1 ; i >= 0 ; i-- ) {
                reverse += str.charAt(i);
            }
            return reverse;
        }

    }












