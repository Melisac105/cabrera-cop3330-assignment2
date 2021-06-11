package ex27.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isEmpty() {
        assertTrue(Validator.isEmpty(""));
        assertTrue(Validator.isEmpty(" "));
        assertTrue(Validator.isEmpty("  "));

        assertFalse(Validator.isEmpty("a"));
        assertFalse(Validator.isEmpty(" a"));
        assertFalse(Validator.isEmpty("a "));
        assertFalse(Validator.isEmpty(" a "));
    }

    @Test
    void hasLengthOf() {
        String value = "123";

        assertTrue(Validator.hasLengthOf(value, 3));
        assertTrue(Validator.hasLengthOf(value, 2));
        assertTrue(Validator.hasLengthOf(value, 1));

        assertFalse(Validator.hasLengthOf(value, 4));
        assertFalse(Validator.hasLengthOf(value, 5));
    }

    @Test
    void isNumber() {
        assertFalse(Validator.isNumber("a"));
        assertFalse(Validator.isNumber("abc 123"));

        assertTrue(Validator.isNumber("1"));
        assertTrue(Validator.isNumber("0099"));
        assertTrue(Validator.isNumber("123"));
    }

    @Test
    void isLetter() {
        assertFalse(Validator.isLetter('1'));
        assertFalse(Validator.isLetter('2'));
        assertFalse(Validator.isLetter("1"));
        assertFalse(Validator.isLetter("2"));
        assertFalse(Validator.isLetter("22"));

        assertTrue(Validator.isLetter('a'));
        assertTrue(Validator.isLetter('d'));
        assertTrue(Validator.isLetter("z"));
        assertTrue(Validator.isLetter("e"));
    }

    @Test
    void allLetters() {
        assertFalse(Validator.allDigits("a"));
        assertFalse(Validator.allDigits("abc"));
        assertFalse(Validator.allDigits("123abc"));

        assertTrue(Validator.allDigits("1"));
        assertTrue(Validator.allDigits("123"));
        assertTrue(Validator.allDigits("1234"));
    }

    @Test
    void isDigit() {
        String notDigit = "a";
        assertFalse(Validator.isDigit(notDigit));

        String digit = "1";
        assertTrue(Validator.isDigit(digit));
    }

    @Test
    void allDigits() {
        assertFalse(Validator.allDigits("abc"));
        assertFalse(Validator.allDigits("123abc"));

        assertTrue(Validator.allDigits("1"));
        assertTrue(Validator.allDigits("123"));
        assertTrue(Validator.allDigits("1234"));
    }

    @Test
    void isEmployeeId() {
        String valid = "AB-1234";
        String valid2 = "Ab-1234";

        assertTrue(Validator.isEmployeeId(valid));
        assertTrue(Validator.isEmployeeId(valid2));

        String invalid = "a-1234";
        String invalid2 = "ab-a234";
        String invalid3 = "ab a234";
        assertFalse(Validator.isEmployeeId(invalid));
        assertFalse(Validator.isEmployeeId(invalid2));
        assertFalse(Validator.isEmployeeId(invalid3));
    }

    @Test
    void validateName() {

    }

    @Test
    void validateEmployeeId() {
        String valid = "AB-1234";
        String valid2 = "Ab-1234";

        assertEquals("", Validator.validateEmployeeId(valid));
        assertEquals("", Validator.validateEmployeeId(valid2));

        String invalid = "a-1234";
        String error = "\"" + invalid +  "\" is not a valid ID.";

        String invalid2 = "ab-a234";
        String error2 = "\"" + invalid2 +  "\" is not a valid ID.";

        String invalid3 = "ab a234";
        String error3 = "\"" + invalid3 +  "\" is not a valid ID.";

        assertEquals(error, Validator.validateEmployeeId(invalid));
        assertEquals(error2, Validator.validateEmployeeId(invalid2));
        assertEquals(error3, Validator.validateEmployeeId(invalid3));
    }

    @Test
    void validateZipCode() {
        String error = "The ZIP code must be numeric.";
        String noError = "";

        assertEquals(error, Validator.validateZipCode("abc 123"));
        assertEquals(error, Validator.validateZipCode("abc"));
        assertEquals(error, Validator.validateZipCode(""));

        assertEquals(noError, Validator.validateZipCode("123"));
        assertEquals(noError, Validator.validateZipCode("009983"));
    }
}
