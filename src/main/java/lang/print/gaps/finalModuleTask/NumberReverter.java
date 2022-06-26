package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int sum = 0;
        int first = number % 10;
        sum = sum + first;
        int second = number / 10;
        int third = second % 10;
        sum = sum + third;
        int fourth = second / 10;
        int fifth  = fourth % 10;
        System.out.println("" + first + third + fifth);
    }
}
