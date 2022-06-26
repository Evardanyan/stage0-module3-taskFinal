package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
//    674 % 10 = 4
//
//    Sum = 0 + 4 = 4
//
//            674 / 10 = 67
//
//    Second iteration
//
//67 % 10 = 7
//
//    Sum = 4 + 7 = 11
//
//            67 / 10 = 6

    public static void calculateSum(int number) {
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
