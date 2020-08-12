package day34_Custom_Class;

public class Carpet {
    /*
    create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
	customOrder(): sets the carpet' width, length, unitprice, & isParsian
	calcCost(): should be able to caculate the total cost of the carpet and return it as double
	toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost() {
        double total = ( width + length ) * unitPrice;
        if ( isPersian ) {
            return total+200;
        } else {
            return total;
        }
        //return (isPersian) ? total+200 : total;   // this also works
    }

    public void customOrder ( double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }

    public String toString() {
        return "witdh: " + width +
                "\nlength: " + length +
                "\nunit price: $" + unitPrice +
                "\ntotal costs: $" + calcCost();


    }




}


