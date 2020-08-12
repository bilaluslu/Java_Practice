package day21_Multi_Dimensional_Arrays;

public class for_Each_Loop {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        for ( int eachElement : nums ) {
            System.out.println(eachElement);
        }

        String[] students = { "Muhtar" , "Asiya" , "Bilal"};

        for ( String eachElement2 : students) {
            System.out.println(eachElement2);
        }


        int[] arr1 = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };

        for ( int eachArr1 : arr1 ) {

            if ( eachArr1 < 5 ) {

                continue;

                //System.out.println(eachArr1);
            }
            System.out.println(eachArr1);
        }
        System.out.println("============================================");

        String sentnce = "I like Java";   // Java like I

        String[] words =  sentnce.split(" ");  // [I, like, Java]

        for(String eachWord : words ){ // 0 ~ 2
            System.out.println(eachWord);
        }

        System.out.println("====================================");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }























    }
}
