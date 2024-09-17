public class CubedFunction implements MathFunction {
    private static String name = "Cubed";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.pow(arg,3);
    }
}
