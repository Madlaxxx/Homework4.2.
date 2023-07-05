public class BmiService {
    public int calculate(double meter, int kg) {
        int a = 2;
        double index = kg / Math.pow(meter, a);
        int bmi = (int) index;

        return bmi;
    }
}
