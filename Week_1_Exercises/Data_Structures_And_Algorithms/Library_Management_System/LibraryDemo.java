package Library_Management_System;

import java.util.Arrays;
import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("2", "1984", "George Orwell");
        Book book3 = new Book("3", "To Kill a Mockingbird", "Harper Lee");

        
        List<Book> bookList = Arrays.asList(book1, book2, book3);
        Book[] sortedBooks = bookList.toArray(new Book[0]);
        Arrays.sort(sortedBooks, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        
        System.out.println("Linear Search Result:");
        Book result1 = BookSearch.linearSearchByTitle(bookList, "1984");
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book not found.");
        }

       
        System.out.println("Binary Search Result:");
        Book result2 = BookSearch.binarySearchByTitle(sortedBooks, "To Kill a Mockingbird");
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book not found.");
        }
    }
}
