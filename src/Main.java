public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.82;
        double mass = 79;
        double bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}
