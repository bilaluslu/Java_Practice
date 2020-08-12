package homePractice;

import java.util.Scanner;

public class hp_06 {
    public static void main(String[] args) {

        /*for (int i = 0 ; i<=86 ; i=2*i+2) {
            System.out.println("Even number: "+ i);
        }*/
/*
        for (int i = 0 ; i < 13 ; i++){
            if (i==4){
                continue;
            }
            System.out.println(i);
        }

        int i = 3;
        while (i<3){
            System.out.println(i);
            if (i==5){
            break;
            }
            i++;
        }

        for (int i = 0 ; i<10 ; i++){
            System.out.println(i);
            if (i==4){
                i=0;
            }
        }
                            //output DooBeeDooBeeDo
        int x = 1;
        System.out.print("Scooby ");
        while(x< 3 ){
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if(x== 3){
            System.out.print("Do");
        }

        int[] num = {3,5,7,4,1,2};
        for(int i = 0 ; i<num.length ; i++){
            System.out.println(2*num[i]);
        }


        float  a  = 100.987_6543f;
        System.out.println(a);

        // grade calculator
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Your Grade:");
        int gr = num.nextInt();

        if (gr>=0 && gr<40){
            System.out.println("Your Grade is: F");
        }
        else if (gr>=40 && gr<60){
            System.out.println("Your Grade is: D");
        }
        else if (gr>=60 && gr<75){
            System.out.println("Your Grade is: C");
        }
        else if (gr>=75 && gr<90){
            System.out.println("Your Grade is: B");
        }
        else if (gr>=90 && gr<=100){
            System.out.println("Your Grade is: A");
        }
        else {
            System.out.println("Invalid Input");
        }


        Scanner s = new Scanner(System.in);


        int house = s.nextInt();
        int player = s.nextInt();

        //your code here

        if(player == 21){
            System.out.println("bust");
        }
        if(player < house){
            System.out.println("player loss");
        }
        if(player > house){
            System.out.println("player wins");
        }
        if(player == house) {
            System.out.println("its a tie");
        }
        if (player > 21 || house > 21){
            System.out.println("invalid input");
        }
*/
        String str = "Cybertek";
        System.out.println(str.charAt(4));




    }
}
