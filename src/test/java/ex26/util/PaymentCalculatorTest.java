package ex26.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        double apr = 12;
        double balance = 5000;
        double monthlyPayment = 100;

        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment));
    }
}