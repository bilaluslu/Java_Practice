package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

 /*
        //implicit casting

        int a = 10;
        long b = a; //implicit casting is done automatically
                // b = 10L;

        // int c = b; b is still long datatype

        int a1 = 100;
        long b1 = (long) a1;    //implicit casting is done manually

        // int c1 = b1;


        // ******explicit casting******

        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snum = (byte) Inum;

        double Dnum = 5.5;
        // float Fnum = (float) Dnum;

        float Fnum = (int) Dnum;       //5.0

        double D1 = 10.5;
        // long L1 = (long) ((float) D1);
        long L1 = (int) D1;
        System.out.println(L1);

        float F1 = 60.5F;
        int I1 = (int) F1;  //prefered
        System.out.println(I1);

        long largeNum = 99999999999L;
        int intNum = (int) largeNum;
        System.out.println(intNum);
*/
        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        System.out.println(ch2);

        double dbl1 = ch2;  //23456.0


    }
}
