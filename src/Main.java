public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        double weightKg = 95.6;
        int bmi = service.calculate(heightM,weightKg);

        System.out.println(bmi);
    }
}