public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 60000.0);
        Product p2 = new Product(102, "Mouse", 50, 500.0);
        Product p3 = new Product(103, "Keyboard", 30, 1500.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("Inventory after adding:");
        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 60, 650.0);

        System.out.println("\nInventory after updating product 102:");
        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\nInventory after deleting product 103:");
        inventory.displayProducts();
    }
}
