package Repl_It;

public class atest_Thunder_Blazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3) {
        if ( available == true || gift == true ) {
            return true;
        } else if ( ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3 ) {
            return true;
        } else if ( ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean x = getThunderBlazz(false,false,6,2,3);
        System.out.println(x);
    }





}
