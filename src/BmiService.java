public class BmiService {

    public double calculate(double heightInMetr, int weightInKg) {
        double bmi = weightInKg / (heightInMetr * heightInMetr);
        return bmi;

    }
}
