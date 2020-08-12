package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
/*
        // pre: changes the value
        int a = 100;
        System.out.println(++a);    //101
        System.out.println(a);      //101

        int b = 100;
        System.out.println(--b);    //99
        System.out.println(b);      //99

        // post : first passes the current value, then eventually changes the veriable value
        int A = 100;
        System.out.println(A++);    // at line 18 A value is still 100
        System.out.println(A);      //101

        int B = 100;
        System.out.println(B--);    //100
        System.out.println(B);      //99
*/

        int z = 10;
        int x = ++z;        //x is increased by 1

        int s = 10;
        int f = s++;        //10 the value of s will be increased by 1

        System.out.println(s);      //11
        System.out.println(f);      //10

        double t1 = 3.5;
        double t2 = t1--;       //3.5 and t1 will be decreased by 1

        System.out.println(t2);     //3.5
        System.out.println(t1);     //2.5



    }
}
