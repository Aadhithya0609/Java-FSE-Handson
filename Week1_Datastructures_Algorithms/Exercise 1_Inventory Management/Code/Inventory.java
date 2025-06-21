import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
