public class BmiService {

    public int calculate(int weightInKg, double heightInMetrs) {
        double bmi = weightInKg / (heightInMetrs * heightInMetrs);
        return (int) bmi;

    }
}
