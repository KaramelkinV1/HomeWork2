public class BmiService {
    public int calculate(double heightM, double weightKg) {
        double result;
        result = weightKg / (heightM * heightM);
        return (int) result;
    }

}