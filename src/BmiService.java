public class BmiService {
    public int calculate(double meter, int kg) {
        double index = kg / Math.pow(meter, 2);
        int bmi = (int) index;

        return bmi;
    }
}
