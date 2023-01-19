package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first * second != 0) {
            int gcd = 1;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0)
                    gcd = i;
            }
            System.out.println(gcd);
        } else {
            System.out.println(Math.max(first, second));
        }
    }
}
