package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number % 10;
        int second = number / 10;
        int third = second % 10;
        int fourth = second / 10;
        int fifth  = fourth % 10;
        System.out.println("" + first + third + fifth + "\n");
    }
}
