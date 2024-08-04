import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);

        CalculatorT1 calculatorT1 = new CalculatorT1(6);
        calculatorT1.addFunction(new SinFunction());
        calculatorT1.addFunction(new CosFunction());
        calculatorT1.addFunction(new LogFunction());
        calculatorT1.addFunction(new SquaredFunction());
        calculatorT1.addFunction(new CubedFunction());
        calculatorT1.addFunction(new FibonacciFunction());

        startCalculator(calculatorT1);

    }

    private static void startCalculator(CalculatorT1 calculator) {
        calculator.listMathFunction();

        System.out.println("Please enter the name of the function:");
        String functionName = in.next();
        if (functionName.equalsIgnoreCase("end"))
            System.exit(0);

        System.out.println("Please enter the argument of the function");
        double functionArg = in.nextDouble();
        double result = calculator.doCalculation(functionName,functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

        startCalculator(calculator);
    }
}