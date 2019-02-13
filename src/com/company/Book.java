//Create a Book class that allows for Book title, author, description, price and isInStock variables

package com.company;

import java.util.Scanner;

////Book class contain private member variables, a default constructor, an overloaded constructor, method called getDisplayText()
public class Book {
    Scanner Keyboard = new Scanner(System.in);

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //Create constructor
    public Book() {
        System.out.println("The constructor has run");
    }


    public Book(String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Scanner getKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        Keyboard = keyboard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String displayText() {
        return "The details of the book are: " + title + ", " + author + ", " + description + ", " + price + ", " + isInStock;
    }
}
