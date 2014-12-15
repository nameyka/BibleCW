package bibleApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main{
    
    ArrayList<Book> Books;
    ReadFiles rf;
    
    public Main() throws FileNotFoundException{
        rf = new ReadFiles();
        Books = new ArrayList<Book>();
        File[] f = rf.getFiles();
        for(File file: f){
            Books.add(Book.setBook(rf.getFile(file.getName())));
        }
        //System.out.println(Books.size());
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        new Main();
    }

}