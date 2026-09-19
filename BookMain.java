public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("Hachet", "Gary Paulsen", 195);
        System.out.println(b1.citation());
        Book b2 = new Book("Macbeth");
        System.out.println(b2.citation());
    }
}