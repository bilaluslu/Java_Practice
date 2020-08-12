package homePractice;

import java.util.Locale;
import java.util.Scanner;

public class hp_07 {
    public static void main(String[] args) {

        //MAX-MIN FINDER
        //AVERAGE OF ARRAY'S ELEMENT
        //COUNTER (COUNTS HOW MANY SAME ELEMENT IN AN ARRAY)


        /*
        HTTP is the protocol that governs communications between
        web servers and web clients (i.e. browsers). Part of the
        protocol includes a status code returned by the server to
        tell the browser the status of its most recent page request.
        Some of the codes and their meanings are listed below:
        status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

        1. declare an int variable called StatusCode
        2. write a if statement that prints out, on a line by itself, the appropriate
        label from the above list based on status.
                Example:
        if status code = 200
        output:
        ok


        int statusCode = 200;

        if(statusCode==200){
            System.out.println("Ok");
        }
        if(statusCode==201){
            System.out.println("Created");
        }
        if(statusCode==202){
            System.out.println("Accepted");
        }
        if(statusCode==301){
            System.out.println("Moved Permanently");
        }
        if(statusCode==303){
            System.out.println("See Other");
        }
        if(statusCode==307){
            System.out.println("Temporary Redirect");
        }
        if(statusCode==400){
            System.out.println("Bad Request");
        }
        if(statusCode==401){
            System.out.println("Unauthorized");
        }
        if(statusCode==403){
            System.out.println("Forbidden");
        }
        if(statusCode==404){
            System.out.println("Not Found");
        }
        if(statusCode==410){
            System.out.println("Gone");
        }
        if(statusCode==500){
            System.out.println("Internal Server Error");
        }
        if(statusCode==503){
            System.out.println("Service Unavailable");
        }


        Scanner num = new Scanner(System.in);
        System.out.println("enter first");
        String s1 = num.nextLine();
        System.out.println("enter second");
        String s2 = num.nextLine();
        String s3 = s1.concat((" "+ s2));
        System.out.println(s3);




        Scanner num = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = num.nextInt();
        if (age<22 && age>0){
            System.out.println("You are not allowed to buy");
        }
        if (age>=22){
            System.out.println("You are allowed to buy");
        }

        //max-min finder

        int n, max, min;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = num.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = num.nextInt();
        }

        max = a[0];
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
            if(min> a[i])
            {
                min = a[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minumum value: " + min);
        System.out.println(("Max - Min value is " + (max-min)));

        //sayac (counter app)

        int counter = 0;


        int[] a ={3,5,7,2,4,3,2,2,4,5,5,5,7,4,7} ;

        for (int i = 0 ; i< a.length ; i++) {
            if (a[i] == 4) {
                counter = counter + 1;
            }
        }
        System.out.println(counter);


        //AVERAGE OF ARRAY'S ELEMENT

        int n , avr = 0; int sum =0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of element in the array: ");
        n = num.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");

        for (int i = 0 ; i < a.length ; i++){
            a[i] = num.nextInt();
            sum = sum + a[i];
        }
        avr = sum / a.length;
        System.out.println(avr);
*/



    }
}
