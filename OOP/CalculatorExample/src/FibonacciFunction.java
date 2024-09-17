public class FibonacciFunction implements MathFunction {
    private static String name = "Fibonacci";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        int num1 = 0, num2 = 1, result = 0;

        for (int i = 0; i < arg; i++) {
            System.out.print(num1 + " ");

            result += num1;
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
        return result;
    }
}
