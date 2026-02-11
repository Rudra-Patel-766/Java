package Day07;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getIsbn() {
        return isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    String searchByTitle(String t) {
        for (Book book : books) {
            if (t.equals(book.getTitle())) {
                return "Title: " + book.getTitle() + " Author: " + book.getAuthor() + " ISBN: " + book.getIsbn();
            }
        }
        return "Book not found";
    }

    void displayAllBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor() + " ISBN: " + book.getIsbn());
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        System.out.print("How many books do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Book " + i);

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("ISBN: ");
            String isbn = sc.nextLine();

            l.addBook(title, author, isbn);
        }

        System.out.print("\nEnter title to search: ");
        String searchTitle = sc.nextLine();

        System.out.println("\nSearching for '" + searchTitle + "':");
        System.out.println("Book found: " + l.searchByTitle(searchTitle));

        System.out.println("\nAll Books in the Library");
        l.displayAllBooks();

        sc.close();
    }
}