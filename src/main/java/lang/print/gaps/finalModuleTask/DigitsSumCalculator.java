package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int first = number % 10;
        sum = sum + first;
        int second = number / 10;
        int third = second % 10;
        sum = sum + third;
        int fourth = second / 10;
        int fifth  = fourth % 10;
        sum = sum + fifth;
        int six = fourth / 10;
        int seven = six % 10;
        sum = sum + seven;
        System.out.println(sum);
    }
}
