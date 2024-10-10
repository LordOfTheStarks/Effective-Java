package LibraryMngSys;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        PhysicalBook physicalBook1 = new PhysicalBook
                ("Harry Potter", "J.K. Rowling", "1234567890",
                 350, "A1");
        PhysicalBook physicalBook2 = new PhysicalBook
                ("The Lord of the Rings", "J.R.R. Tolkien", "0987654321",
                 500, "B2");

        EBook ebook1 = new EBook
                ("Digital Fortress", "Dan Brown", "1122334455",
                 400, "www.ebooks.com/df", 1.5);
        EBook ebook2 = new EBook
                ("Angels and Demons", "Dan Brown", "5544332211",
                 450, "www.ebooks.com/ad", 2.0);

        library.addBook(physicalBook1);
        library.addBook(physicalBook2);
        library.addBook(ebook1);
        library.addBook(ebook2);

        System.out.println("Library Catalog: ");
        library.displayBooks();

        physicalBook1.borrowBook();
        System.out.println();

        System.out.println("Searching for 'Digital Fortress':");
        library.searchBookByTitle("Digital Fortress");
    }
}
