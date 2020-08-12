package day09_Nested_If_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num1 = 100;
        String result = "";

        if ( num1 % 2 == 0 ) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.println(result);

        //if the IF statement is only returning value and assigning it to variable then we can apply ternary

        //in ternary ==> ? means if, : means else

        int num2 = 101;
        String result2 = ( num2 % 2 == 0 ) ? "even" : "odd" ;
        System.out.println(result2);

        System.out.println("==========================");

        int a1 = 10;
        int a2 = 20;
        int max = 0;

        if (num1 > num2) {
            max = a1;
        }else {
            max = a2;
        }
        System.out.println(max);


        int max2 = (a1>a2) ? a1 : a2;
        System.out.println(max2);

        System.out.println("====================");

        String str = "";
        if(true){
            str = "hello";
        } else {
            str = "hola";
        }
        System.out.println(str);

        String str2 = (true) ? "hello" : "hola";
        System.out.println(str2);

        System.out.println("==================================");

        int age = 21;
        boolean eligibility ;

        if (age >= 21) {
            eligibility = true;
        } else {
            eligibility = false;
        }
        System.out.println(eligibility);
        System.out.println("===");

        boolean eligibility1 = (age >= 21) ? true : false ;
        System.out.println(eligibility1);















    }
}
