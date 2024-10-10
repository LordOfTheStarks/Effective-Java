package LibraryMngSys;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("---------------------");
            book.getBookInfo();
        }
    }

    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book found: ");
                book.getBookInfo();
                return;
            }
        }
        System.out.println("Book with title \""+ title + "\" not found.");
    }
}
