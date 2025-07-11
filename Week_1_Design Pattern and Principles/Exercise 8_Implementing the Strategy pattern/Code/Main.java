public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.makePayment(2500.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(1800.50);
    }
}
