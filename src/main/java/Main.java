public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weightInKg = 98;
        double heightInMeters = 1.87;
        int bmi = bmiService.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
