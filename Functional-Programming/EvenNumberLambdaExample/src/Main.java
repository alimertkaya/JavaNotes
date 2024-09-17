public class Main {
    int sum = 0;
    int product = 1;
    int[] square = new int[5];
    public static void main(String[] args)
    {
//        EvenNumberOperation operation = (int k) -> System.out.println(k);
//        doIt(10,operation);
        doIt(10, (int k) -> System.out.println(k));

        Main m = new Main();

//        EvenNumberOperation operation = (int k) -> {m.sum += k;};
//        doIt(10,operation);
        doIt(10, (int k) -> m.sum += k);
        System.out.println("Sum: " + m.sum);

//        EvenNumberOperation operation = (int k) -> {m.product *= k;};
//        doIt(10,operation);
        doIt(10, (int k) -> m.product *= k);
        System.out.println("Product: " + m.product);

//        EvenNumberOperation operation = (int k) -> {m.square[k/2 - 1] = k * k;};
//        doIt(10,operation);
        doIt(10, (int k) -> m.square[k/2 - 1] = k * k);
        for (int i : m.square)
            System.out.println(i + " ");

    }
    public static void doIt(int n, EvenNumberOperation operation) {
        for (int i = 2; i <= n; i += 2) {
            operation.operate(i);
        }
    }
}