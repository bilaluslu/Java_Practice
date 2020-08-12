package day41_Inheritance;

public class Ebook extends Book {
    // title (inherited)
    // author (inherited)
    // price (inherited)
    // toString()  (inherited)
    // size , pages , readbook()

    public String size;
    public int pages;

    public void readbook(){
        System.out.println( "Reading " + title );
    }


}
