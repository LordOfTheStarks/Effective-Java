package LibraryMngSys;

public class Book {

    protected String title;
    protected String author;
    protected String ISBN;
    int numberOfPages;

    public Book(String title, String author, String ISBN, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    public void getBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
