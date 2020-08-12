package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\tHello");
                //   \t means a paragraph space

        System.out.println("Cybertek School");
        System.out.println("Cybertek\nSchool");
        System.out.println("\nMy\nName\nIs\nBilal");
                //   \n means new line, starts with new line

        //print: My favorite TV show is "Game of Thrones"

        System.out.println("My favorite TV show is \"Game Of Thrones\"");
                //  \" means double quote, prints double quote

        System.out.println("\\");
                //  \\ prints single slash on console

        System.out.println("My favorite TV show is 'Game Of Thrones'");     //   ' prints single quote
        System.out.println("My favorite TV show is \'Game Of Thrones\'");   //   \' prints single quote


    }

}
