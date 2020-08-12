package day17_While_Loops;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java is fun, Java is cool, Java Java Java cool Java"; // .tolowerCase() " den sonra eklersek hepsini
                                                        //lower case e cevirir ignorecase sensivitiy yerine kullanilabilir

        String result = "";

        int count = 0;
        String word = "Java";   // yeni bir variable tanimlayip buna da .toLowerCase eklememiz gerekir after " before ;
        while ( str.contains(word) ) {
            count++;
            str = str.replaceFirst(word,"");  //after counting first "Java" ,
                                                                // we need to remove it from str

        }
        System.out.println(count);      // output is 5















    }
}
