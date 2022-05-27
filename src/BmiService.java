public class BmiService {
    public double calculate(double mass) {
        double height = 1.82;
        double bmi = (mass / (height * height));
        return bmi;
    }
}
