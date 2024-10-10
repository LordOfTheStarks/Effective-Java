package LibraryMngSys;

public class PhysicalBook extends Book{

    private String shelfLocation;
    private boolean borrowedStatus;

    public PhysicalBook(String title, String author, String ISBN, int numberOfPages, String shelfLocation){
        super(title, author, ISBN, numberOfPages);
        this.shelfLocation = shelfLocation;
        this.borrowedStatus = false;
    }

    @Override
    public void getBookInfo() {
        super.getBookInfo();
        System.out.println("Shelf Location: " + shelfLocation);
        System.out.println("Borrowed: " + (borrowedStatus ? "Yes" : "No"));
    }
    public void borrowBook() {
        if (!borrowedStatus) {
            borrowedStatus = true;
            System.out.println("The book has been borrowed.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }
    public void returnBook() {
        if (borrowedStatus) {
            borrowedStatus = false;
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }
}
