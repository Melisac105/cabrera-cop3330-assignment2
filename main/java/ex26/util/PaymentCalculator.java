package ex26.util;

public class PaymentCalculator {

    //  n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

    public static int calculateMonthsUntilPaidOff(double balance, double aprPercent, double monthlyPayment) {
        double i = (aprPercent / 100) / 365;

        double n = -0.033333 *
                Math.log(1 + balance / monthlyPayment * (1 - Math.pow(1 + i, 30))) /
                Math.log(1 + i);

        return (int) Math.ceil(n);
    }
}
