package uz.beproedu.model4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    private String bookName;
    private List<String> autor;
    private String isbn;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<String> getAutor() {
//        System.out.println("Authors: " + autor);
        return autor;
    }

    public void setAutor(List<String> autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void ListAutor(){
        System.out.println("Author: " + autor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                '}';
    }
}
