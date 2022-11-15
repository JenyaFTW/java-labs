public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.getSum((short)2, (short)2, 8, 8);

        System.out.println("Sum: %s".formatted(sum));
    }
}
