public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            float sum = calculator.getSum((short)2, (short)2, (short)8, (short)8);

            System.out.println("Sum: %f".formatted(sum));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
