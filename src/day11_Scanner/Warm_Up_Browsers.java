package day11_Scanner;

public class Warm_Up_Browsers {
    public static void main(String[] args) {

/*        write a program that can display the selected browser
        1. declear a String variable called browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
        Note: Do Not use scanner or if statement or ternary for this task
*/


        String browserName = "Opera";

        switch (browserName) {
            case "Chrome" :
                System.out.println("\nChrome is opening...");
                break;
            case "Firefox" :
                System.out.println("\nFirefox is opening...");
                break;
            case "Opera" :
                System.out.println("\nOpera is opening...");
                break;
            case "Safari" :
                System.out.println("\nSafari is opening...");
                break;
            default:
                System.out.println("\nInvalid Entry");
        }
























    }
}
