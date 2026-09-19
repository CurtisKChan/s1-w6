public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title){
        this(title, "Unknown", 100);
    }

    public String citation() {
        String line = this.title + " by " + this.author + ", " + this.pages + " pages.";
        return line;
    }
}