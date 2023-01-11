public class Calculator {
    /*
    Student number: 0526
    C2 = 526 % 2 = 0;
    C3 = 526 % 3 = 1;
    C5 = 526 % 5 = 1;
    C7 = 526 % 7 = 1

    Operations:
    O1: +
    O2: /

    Type: short
     */
    private int CONSTANT = 2;

    public float getSum(short a, short b, short n, short m) {
        float sum = 0;

        if ((b <= 0 && m >= 0) || (a <= -CONSTANT && n >= -CONSTANT)) {
            throw new ArithmeticException("Can't divide by zero");
        }

        for (short i = a; i <= n; i++) {
            int bottom = i + CONSTANT;
            float incompleteTop = (float) i / bottom;

            for (short j = b; j <= m; j++) {
                sum += incompleteTop / j;
            }
        }
        return sum;
    }
}
