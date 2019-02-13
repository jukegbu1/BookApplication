//Create a Book class that allows for Book title, author, description, price and isInStock variables
//Book class contain private member variables, a default constructor, an overloaded constructor, method called getDisplayText()
//which prints the author, title and description
//The application shall also contain getters and setters for each private member variable
//Create another class called BookApp which contains the main method
//In the main method you shall create an instance of a Book and print the Author, Title and Description

package com.company;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        Book b = new Book();
        b.setAuthor("Jennifer ");
        b.setTitle(" Happy Day!");
        b.setDescription("2019 novel about Java programming! ");
        b.setPrice(20);
        b.setInStock(true);

        String message=b.displayText();
        System.out.println(message);



    }
}
