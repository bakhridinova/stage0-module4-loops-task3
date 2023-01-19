package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        StringBuilder nine = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            nine.append("9");
            sum += Integer.parseInt(nine.toString());
        }
        System.out.println(sum);
    }
}
