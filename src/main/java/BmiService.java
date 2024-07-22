public class BmiService {
    public int calculate(double weightInKg, double heightInMeters) {
        double bmi = weightInKg / (heightInMeters * heightInMeters); //формула для расчёта индекса
        return (int) bmi;
    }
}
