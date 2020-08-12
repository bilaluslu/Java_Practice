package day12_Java_Recap;

public class warm_up {
    public static void main(String[] args) {

/*        1. write a program that can calculate the area of circle
        needed information:
        1. radius of the cirle
        2. Ask user to enter two words. Then add them together and print.
        Input:
        one
        eight
        Output:
        oneeight
        3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
        If marks < 60, then print "Fail"
        If marks >= 60, but less than 90, then print "Pass"
        If marks >= 90, then print "Passed with Distinction"
        MUST use scanner
        4. Revenue can be calculated as the selling price of the product times
        the quantity sold, i.e. revenue = price × quantity. Write a program that
        asks the user to enter product price and quantity and then calculate the
        revenue. If the revenue is more than 5000 a discount is 10% offered.
            Program should display the discount and net revenue.


        // warm up 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = input.nextDouble();
        System.out.println("area of circle is= " + (radius*radius*3.14));

        // warm up 2
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter First Word");
        String str1 = input1.nextLine();
        System.out.println("Enter Second Word");
        String str2 = input1.nextLine();
        System.out.println("YOur output is: " + str1 + str2);


        //warm up 3
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your grade:");
        double grade = input2.nextDouble();

        if ( grade <60 ) {
            System.out.println("Fail");
        }
        else if ( grade>=60 && grade<90 ) {
            System.out.println("Pass");
        }
        else if ( grade >=90 ) {
            System.out.println("Passed with Distinction");
        }

        // warm up 4
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Price");
        double price = input3.nextDouble();
        System.out.println("Enter Quantity");
        int quantity = input3.nextInt();
        double revenue = price * quantity ;

        if (revenue >= 5000) {
            System.out.println("Your Total After Discount is: " + ( revenue *0.9 ));
            System.out.println("Your Discount Amount is: " + ( revenue*0.1 ) );
        }
        else {
            System.out.println("Your Total is: " + revenue);
        }
*/

















    }
}
