package Repl_It;

import java.util.ArrayList;

public class atest_Delivery_calculation {

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        int count = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            count += deliveries.get(i);
        }
        int x = count / max_fuel;
        if (count % max_fuel == 0) {
            return x;
        } else {
            return x + 1;
        }
    }


    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
