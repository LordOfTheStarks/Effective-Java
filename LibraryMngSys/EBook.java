package LibraryMngSys;

public class EBook extends Book{

    private String downloadLink;
    private double fileSize;

    public EBook
            (String title, String author, String ISBN, int numberOfPages, String downloadLink, double fileSize) {
        super(title, author, ISBN, numberOfPages);
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    @Override
    public void getBookInfo() {
        super.getBookInfo();
        System.out.println("Download link: " + downloadLink);
        System.out.println("File size: " + fileSize + " MB");
    }
}
