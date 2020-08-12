package homePractice;

// Java program to demonstrate encapsulation
class Encapsulate {
// private variables declared 
// these can only be accessed by 
// public methods of class

    private int SSN;

    // get method for ssn to access 
// private variable ssn
    public int getSSN() {
        return SSN;
    }

    // set method for ssn to access 
// private variable ssn
    public void setSSN(int newSSN) {
        SSN = newSSN;
    }
}
