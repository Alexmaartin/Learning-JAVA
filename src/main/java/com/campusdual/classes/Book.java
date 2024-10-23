package com.campusdual.classes;

import com.campusdual.Utils;

public class Book {

    private String tittle;
    public String author;
    public int pageNumber;

    public Book(){

        this.tittle = Utils.string("Write the book tittle: ");
        this.author  = Utils.string("Write the book autor: ");
        this.pageNumber = Utils.integer("Write the number of pages: ");
    }

    public Book(String tittle, String author, int numberOfPages){
        this.tittle = tittle;
        this.author = author;
        this.pageNumber = numberOfPages;
    }

    public void showBookDetails(){
        System.out.println(this.tittle+ " - " + this.author + " (" + this.pageNumber + " pages");
    }

    public static void main(String[] args) {
        Book b1 = new Book("Rhythm of War", "Brandon Sanderson", 1902);
        Book b2 = new Book("La vida de PI","Alejandro", 1200);
        Book b3 = new Book("Hola", "Michael Jordan", 13);
        Book b4 = new Book();


        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();
    }
}
