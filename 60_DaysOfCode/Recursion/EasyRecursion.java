public class EasyRecursion {
    public static void main(String[] args) {
        double pow = myPow(-2,-3);
        System.out.println(pow);
    }

    static public double myPow(double x, int n) {
        if (n == 0) {
            return 1;  // Base case: x^0 = 1
        }

        if (x == 1) return 1;  // Optimization: 1^n = 1
        if (x == -1) return (n % 2 == 0) ? 1 : -1; // Optimization: (-1)^even = 1, (-1)^odd = -1

        long N = n; // Convert to long to prevent overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if (N % 2 != 0) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }
}
