package ex25.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void isVeryWeakPassword() {
        String password1 = "1234";
        String password2 = "abcd123$";

        assertTrue(Processing.isVeryWeakPassword(password1));
        assertFalse(Processing.isVeryWeakPassword(password2));
    }

    @Test
    void isWeakPassword() {
        String password1 = "abd";
        String password2 = "abcd123$";

        assertTrue(Processing.isWeakPassword(password1));
        assertFalse(Processing.isWeakPassword(password2));
    }

    @Test
    void isStrongPassword() {
        String password1 = "hellower56";
        String password2 = "he@";

        assertTrue(Processing.isStrongPassword(password1));
        assertFalse(Processing.isStrongPassword(password2));
    }

    @Test
    void isVeryStrongPassword() {
        String password1 = "hellower56$%";
        String password2 = "abcd123";

        assertTrue(Processing.isVeryStrongPassword(password1));
        assertFalse(Processing.isVeryStrongPassword(password2));
    }
}