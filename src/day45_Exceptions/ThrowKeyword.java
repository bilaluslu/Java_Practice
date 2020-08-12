package day45_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();

        //throw obj;

        throw new NoSuchElementException();

    }
}
