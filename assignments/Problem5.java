//Write a Java program to create a class called "Book" with attributes for title, author, 
//and ISBN, and methods to add and remove books from a collection.


package com.assignments;

import java.util.Scanner ;

class BookStore {
	//variables
		String title ;
		String author ;
		long ISBN ;
		
		public BookStore(String title, String author, long iSBN) {
			this.title = title;
			this.author = author;
			ISBN = iSBN;
		}
		
	    public void displayBookDetails() {
	        System.out.println("ISBN Number: " + ISBN);
	        System.out.println("Book Title: " + title);
	        System.out.println("Book Author: " + author);
	    
	    }				
		
}
class Book {
	private BookStore [] bookstore ;
	private int bookCount  ;	
	
	
	public Book(int size) {
		bookstore = new BookStore[size];
		bookCount = 0 ;
	}

	//method 1
	public void addBook(String title, String author, long ISBN) {
		if(bookCount < bookstore.length) {
			bookstore[bookCount++] = new BookStore(title, author,ISBN);
			System.out.println("book added successfully!");
		} else {
            System.out.println("Cannot add more book. book store is full.");
        }
	}
	
	//method 2
	public void removeBook(long ISBN) {
		for (int i = 0; i < bookCount; i++) {
			if(bookstore[i].ISBN == ISBN ) {
				for (int j = i; j < bookCount - 1; j++) {
                    bookstore[j] = bookstore[j + 1];
                }
                bookstore[--bookCount] = null;  // Clear the last account slot
                System.out.println("book removed successfully.");
                return;
			}
		}
		System.out.println("ISBN not found.");
	}
	
	
	public void viewBookDetails(long ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (bookstore[i].ISBN == ISBN) {
                bookstore[i].displayBookDetails();
                return;
            }
        }
        System.out.println("ISBN not found.");
    }
}
	

public class Problem5 {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner (System.in);
		Book book = new Book(5) ;

		while(true) {
			
			System.out.println("1.Add the Book");
			System.out.println("2.Remove the Book");
			System.out.println("3.View the Book Details");
			System.out.println("");
			
			System.out.println("Enter your choice");		
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1 :
				System.out.println("Enter the title of the book :");
				String title = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the author of the book :");
				String author = sc.nextLine();
				System.out.println("Enter the ISBN number(13 number) :");
				long ISBN = sc.nextLong();
				book.addBook(title, author, ISBN);
				break;
				
			case 2 :
				System.out.print("Enter ISBN number of the book : ");
                long ISBNnum = sc.nextLong();
				book.removeBook(ISBNnum);
				break;
				
			case 3 :
				System.out.print("Enter ISBN number of the book : ");
                long ISBNnumber = sc.nextLong();
				book.viewBookDetails(ISBNnumber);
				break;
				
			case 4 :
				System.out.println("Thank you");
				System.exit(0);
				break;
				
			default :
				System.out.println("Invalid choice , please try again");
			}
			
		}
			
	}
}
