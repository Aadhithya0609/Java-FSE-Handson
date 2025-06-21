public class WebApp implements Observer {
    private String appId;

    public WebApp(String appId) {
        this.appId = appId;
    }

    public void update(String stockName, double price) {
        System.out.println("WebApp " + appId + " - " + stockName + " updated to ₹" + price);
    }
}
