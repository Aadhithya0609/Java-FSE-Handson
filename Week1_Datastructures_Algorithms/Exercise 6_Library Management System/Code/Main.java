public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Basics", "James"),
            new Book(102, "Python Programming", "Guido"),
            new Book(103, "C Programming", "Dennis"),
            new Book(104, "Data Structures", "Mark"),
            new Book(105, "Operating Systems", "Andrew")
        };

        System.out.println("All Books:");
        Library.displayBooks(books);

        System.out.println("\nLinear Search: Searching for 'Python Programming'");
        Book b1 = Library.linearSearch(books, "Python Programming");
        System.out.println(b1 != null ? b1 : "Book not found");

        System.out.println("\nBinary Search: Searching for 'Python Programming'");
        Book b2 = Library.binarySearch(books, "Python Programming");
        System.out.println(b2 != null ? b2 : "Book not found");
    }
}
