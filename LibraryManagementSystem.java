package com.mycompany.lab02_421429979;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        Book book1 = new BookImpl("Yashodara Wathuma", "Martin Wickramasinghe");
        Book book2 = new BookImpl("Madol Doova", "Martin Wickramasinghe");
        Book book3 = new BookImpl("Gehenu Lamai", "Piyasena S. Jayawardena");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

       
        book1.checkOut();

        // Search for a book by title
        String searchTitle = "Madol Doova";
        Book foundBookByTitle = library.findBookByTitle(searchTitle);
        if (foundBookByTitle != null) {
            System.out.println("Book found by title: " + foundBookByTitle.getTitle() + " by " + foundBookByTitle.getAuthor());
            System.out.println("Is the book checked out? " + foundBookByTitle.isCheckedOut());
        } else {
            System.out.println("Book with title " + searchTitle + " not found in the library.");
        }

        // Search for a book by author
        String searchAuthor = "Martin Wickramasinghe";
        Book foundBookByAuthor = library.findBookByAuthor(searchAuthor);
        if (foundBookByAuthor != null) {
            System.out.println("Book found by author: " + foundBookByAuthor.getTitle() + " by " + foundBookByAuthor.getAuthor());
            System.out.println("Is the book checked out? " + foundBookByAuthor.isCheckedOut());
        } else {
            System.out.println("No book by author " + searchAuthor + " found in the library.");
        }
    }

    // Implementation of Book concrete class
    private static class BookImpl extends Book {
        public BookImpl(String title, String author) {
            super(title, author);
        }
    }
}
