public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 2500.0),
            new Order(2, "Bob", 1500.0),
            new Order(3, "Charlie", 5000.0),
            new Order(4, "David", 1000.0),
            new Order(5, "Eve", 3000.0)
        };

        System.out.println("Original Orders:");
        OrderSorter.printOrders(orders);

        Order[] bubbleSorted = orders.clone();
        OrderSorter.bubbleSort(bubbleSorted);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        OrderSorter.printOrders(bubbleSorted);

        Order[] quickSorted = orders.clone();
        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        OrderSorter.printOrders(quickSorted);
    }
}
