package Financial_Forecasting;

public class FinancialCalculator {

    
    public double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        } else {
            return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
        }
    }
}
