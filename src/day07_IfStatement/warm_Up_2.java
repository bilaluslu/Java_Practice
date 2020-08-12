package day07_IfStatement;

public class warm_Up_2 {
    public static void main(String[] args) {


        //  2. write a java program that accepts three numbers and return the maximum number
        //				(assume that none of them are equal)
        //	3. write a java program that accepts three numbers and return the minimum number
        //				(assume that none of them are equal)
        //	4. write a java program that accepts three numbers and rteurn the mediam number
        //				(assume that none of them are equal)

        int a = 9;
        int b = 2;
        int c = 6;

        boolean amax = a>b && a>c;
        boolean bmax = b>a && b>c;
        boolean cmax = c>a && c>b;

        boolean amin = a<b && a<c;
        boolean bmin = b<a && b<c;
        boolean cmin = c<a && c<b;

        boolean amed = (b<a && a<c)||(c<a && a<b);
        boolean bmed = (a<b && b<c)||(c<b && b<a);
        boolean cmed = (a<c && c<b)||(b<c && c<a);


        if (amax){
            System.out.println("A is greater");
        }
        if (bmax){
            System.out.println("B is greater");
        }
        if (cmax){
            System.out.println("C is greater");
        }
        if(amin){
            System.out.println("A is min");
        }
        if (bmin){
            System.out.println("B is min");
        }
        if (cmin){
            System.out.println("C is min");
        }
        if (amed){
            System.out.println("A is med");
        }
        if (bmed){
            System.out.println("B is med");
        }
        if (cmed){
            System.out.println("C is med");
        }

        System.out.println("\n\n");

        //5. write a java program that can identify if a person is eligible to vote for Donald Trump

        int age = 18;
        boolean UScitizen = true;

        boolean eligible = age >= 18 && UScitizen == true;

        if(eligible == true){
            System.out.println("You are eligible to vote");
        }

        if(eligible != true){
            System.out.println("You are not eligible to vote");
        }






    }
}
