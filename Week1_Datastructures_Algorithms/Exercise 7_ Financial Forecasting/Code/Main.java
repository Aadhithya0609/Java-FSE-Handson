public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;
        double growthRate = 0.05; // 5%
        int years = 5;

        double recursiveResult = FinancialForecaster.forecastRecursive(initialValue, growthRate, years);
        double iterativeResult = FinancialForecaster.forecastIterative(initialValue, growthRate, years);

        System.out.println("Initial Value: ₹" + initialValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("\nPredicted Value (Recursive): ₹" + recursiveResult);
        System.out.println("Predicted Value (Iterative): ₹" + iterativeResult);
    }
}
