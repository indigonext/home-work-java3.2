public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    double mass = 79;
    double bmi = service.calculate(mass);
        System.out.println(bmi);
    }
}
