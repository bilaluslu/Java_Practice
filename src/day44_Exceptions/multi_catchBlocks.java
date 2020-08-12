package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println( 10/0 );
        } catch (ClassCastException e){
            System.out.println("class cast");
        } catch (NoSuchElementException e){
            System.out.println("no such element");
        } catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound");
        } catch (RuntimeException e){
            System.out.println("runtime");
        }
    }
}
