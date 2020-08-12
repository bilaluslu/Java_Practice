package day06_Shorthand_LogicalOperators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int x = 20;
        x += 10;
        System.out.println(x);      //30
        System.out.println(x+=20);  //50
        System.out.println(x+=15);  //65


        int a1 = 100;
        int b1 = (a1*2) + ++a1;
        System.out.println(b1);

        int a2 = 10;
        int b2 = a2-=5;
        System.out.println("\n" + b2);

        int x1 = 10;
        int y1 = x1+=10*2;
        System.out.println("\n" + y1);

        int q = 20;
        int p = q*=20*3;
        System.out.println("\n" + p);

        int num1 = 300;
        num1 /= 2;
        System.out.println("\n" + num1);

        int num2 = 400;
        num2 /= 20 + 10;    //num2 = num2 / 30 ==> 13.33 ==> 13
        System.out.println("\n" + num2);

        int num3 = 300;
        num3 %= 10+20;  // num3 = num3 % 30 ==> 0
        System.out.println("\n" + num3);







    }
}
