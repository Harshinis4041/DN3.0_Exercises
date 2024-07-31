package Financial_Forecasting;

public class FinancialForecast {

    public static void main(String[] args) {
        FinancialCalculator calculator = new FinancialCalculator();

        double initialValue = 1000.0; 
        double growthRate = 0.05; 
        int years = 10; 

        double futureValue = calculator.calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
