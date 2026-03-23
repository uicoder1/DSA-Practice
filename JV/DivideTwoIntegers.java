public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        // overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {

            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // apply sign
        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {

        int dividend1 = 10, divisor1 = 3;
        int dividend2 = 7, divisor2 = -3;

        System.out.println("Result 1: " + divide(dividend1, divisor1));
        System.out.println("Result 2: " + divide(dividend2, divisor2));
    }
}