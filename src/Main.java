public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMetrs = (int)1.87;
        int index = service.calculate(weightInKg, heightInMetrs);
        System.out.print(index);
    }
}
