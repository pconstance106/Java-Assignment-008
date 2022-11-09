public class InfiniteSeries {
    public static void main(String[] args) {
            int n = 17;
            for (double x : new double[] {0.1,1,10,100}) {
                check(x, n);
            }
            for (double x : new double[] {-0.1,-1,-10,-100}) {
                check(x, n);
            }
        }
        public static double myExp(double x, int n) {
            double num = 1;
            double den = 1;
            double total = 1;

            for (int i = 1; i <= n; i++) {
                num *= x;
                den *= i;
                total += num / den;
            }
            return total;
        }
        public static double check(double x, int n) {
            double exp = myExp(x, n);
            System.out.printf("%12s  %s%n","x:",x);
            System.out.printf("%12s  %s%n","myExp(x):",exp);
            System.out.printf("%12s  %s%n","Math.exp(x):",Math.exp(x));
            return exp;
        }
    }