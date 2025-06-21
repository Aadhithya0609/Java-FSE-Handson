public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripePayment = new StripeAdapter(new StripeGateway());
        stripePayment.processPayment(1500.00);

        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPalGateway());
        paypalPayment.processPayment(2000.50);
    }
}
