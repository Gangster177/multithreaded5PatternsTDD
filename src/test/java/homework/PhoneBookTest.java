package homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();
    private static int testNumber;
    @BeforeAll
    public static void startTest() {
        System.out.println("Running Tests...");
        testNumber = 0;
    }

    @BeforeEach
    public void iniTest() {
        testNumber++;
        System.out.println("Starting test №: " + testNumber);
    }


    @Test
    public void addContactReturnQuantity() {
        final int expected = 1;
        final int actual = phoneBook.add("One", "111-111");
        assertThat(actual, greaterThanOrEqualTo(expected));
    }

    @Test
    public void addRepeatedContact (){
        final int expected = 2;
        phoneBook.add("Two", "111-111");
        final int actual = phoneBook.add("One", "222-222");
        assertEquals(expected, actual);
    }

    @Test
    public void findByNumber(){
        final String expected = "Three";
        phoneBook.add("Three", "333-333");
        final String actual = phoneBook.findByNumber("333-333");
        assertEquals(expected,actual);
    }
}
