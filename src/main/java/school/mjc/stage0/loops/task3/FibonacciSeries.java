package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(fib(i));
        }
    }

    private int fib(int n) {
        int[] f = new int[n + 2];
        int i; f[0] = 0; f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
