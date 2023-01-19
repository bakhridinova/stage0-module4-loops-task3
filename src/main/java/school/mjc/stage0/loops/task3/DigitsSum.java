package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int length = String.valueOf(t).length();
        t = Math.abs(t);
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
