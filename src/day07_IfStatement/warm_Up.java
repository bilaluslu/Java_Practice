package day07_IfStatement;

public class warm_Up {
    public static void main(String[] args) {

        //  1. A triangle is valid if the sum of all the three angles is
        //  equal to 180 degrees. Write a program that declares three integers
        //  as angles and check whether a triangle is valid or not.

        short angle1 = 0;
        short angle2 = 180;
        short angle3 = 0;

        int sumOfAngles = angle1 + angle2 + angle3;

        boolean validTriangle = sumOfAngles == 180;

        if (validTriangle){
            System.out.println("the shape is  a triangle");
        }
        if(!validTriangle){
            System.out.println("the shape is not valid");
        }





    }
}
