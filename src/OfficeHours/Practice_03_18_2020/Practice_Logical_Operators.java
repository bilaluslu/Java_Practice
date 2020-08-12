package OfficeHours.Practice_03_18_2020;

public class Practice_Logical_Operators {
    public static void main(String[] args) {
        //    || , && , !

        boolean r1 = "Muhtar" == "Bad Guy";     //false

        System.out.println(r1);

        boolean r2 = "Muhtar" != "Good Guy";    //true

        System.out.println(r2);

        boolean r3 = 10 >= 9;       //true

        System.out.println(r3);

        boolean r4 = !false == !true;
                    // true ==  false  ==> false
        System.out.println(r4);


        // ||: as long as one condition is true returns true

        boolean result1 = 9 != 8 || 9 == 8;
                         //  true || false ==> true
        System.out.println(result1);

        boolean result2 = 'a' == 'A' || 'A' == 'b' ;










    }
}
