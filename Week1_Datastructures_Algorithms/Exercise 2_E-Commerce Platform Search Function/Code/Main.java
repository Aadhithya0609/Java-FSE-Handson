public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        System.out.println("Linear Search: Searching for 'Mobile'");
        Product result1 = SearchEngine.linearSearch(products, "Mobile");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\nBinary Search: Searching for 'Mobile'");
        Product result2 = SearchEngine.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
