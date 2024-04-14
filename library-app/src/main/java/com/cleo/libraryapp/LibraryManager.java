package com.cleo.libraryapp;

public class LibraryManager {
    // Property
    private List<Book> books;

    // Constructor
    public LibraryManager() {
        this.books = new ArrayList<>();
    }

    // Methods
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Removed book: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Borrowed book: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Returned book: " + book.getTitle());
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void displayAllBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println();
        }
    }
}
