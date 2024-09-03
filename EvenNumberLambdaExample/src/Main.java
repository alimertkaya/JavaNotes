public class Main {
    public static void main(String[] args)
    {


    }
    public static void doIt(int n, EvenNumberOperation operation) {
        for (int i = 2; i <= n; i += 2) {
            operation.operate(n);
        }
    }
}