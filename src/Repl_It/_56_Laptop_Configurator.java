package Repl_It;

import java.util.Scanner;

public class _56_Laptop_Configurator {
    public static void main(String[] args) {
/*        First ask user for a screen size. If screen size is equals to 13.3,
add  $200 to the laptop price. If screen size is equals to  15.0 -
add  $300 to the laptop price. If screen size is equals to  17.3 -
add  $400 to the laptop price.  Then ask user for CPU type.
If CPU type equals to i3, add  $150 to the laptop price.
If CPU type equals to i5, add  $250 to the laptop price.
If CPU type equals to i7, add  $350 to the laptop price.
Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.
If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution.
There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
 */


        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        /* WRITE YOUR CODE HERE */

        System.out.println("Select screen size:");
        screenType = scan.next();

        price += ( screenType.equalsIgnoreCase("13.3")) ? +200
                : ( screenType.equalsIgnoreCase("15.0")) ? +300
                : ( screenType.equalsIgnoreCase("17.3")) ? +400 : 0;

        System.out.println("Select CPU type:");
        cpu = scan.next();

        price += ( cpu.equalsIgnoreCase("i3")) ? +150
                : ( cpu.equalsIgnoreCase("i5")) ? +250
                : ( cpu.equalsIgnoreCase("i7")) ? +350 : 0;

        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        price += ( ram * 12.5);

        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        if ( storageType.equalsIgnoreCase("HDD") ) {
            price += ( memorySize * 0.1);
        } else if ( storageType.equalsIgnoreCase("SSD")) {
            price += ( memorySize * 0.2 );
        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();

        if (resolution.equalsIgnoreCase("Fullhd")) {
            price += 100;
        } else if (resolution.equalsIgnoreCase("4K")) {
            price += 200;
        }


        System.out.println("Laptop price is: $" + price);






























    }
}
