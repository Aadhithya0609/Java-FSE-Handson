public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("M1");
        Observer mobile2 = new MobileApp("M2");
        Observer web1 = new WebApp("W1");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        stockMarket.setStockData("TCS", 3580.75);
        System.out.println();

        stockMarket.registerObserver(mobile2);
        stockMarket.setStockData("INFY", 1450.60);
        System.out.println();

        stockMarket.removeObserver(mobile1);
        stockMarket.setStockData("RELIANCE", 2885.00);
    }
}
