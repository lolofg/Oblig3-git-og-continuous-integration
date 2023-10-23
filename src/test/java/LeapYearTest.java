import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    void test_divisible_by_4_but_not_100_are_leap_years(){
        assertEquals(true, LeapYear.isLeapYear(4));
    }

    @Test
    void test_divisible_by_400_are_leap_years(){
        assertEquals(true, LeapYear.isLeapYear(400));
    }

    @Test
    void test_not_divisible_by_4_are_not_leap_years(){
        assertEquals(false, LeapYear.isLeapYear(3));
    }

    @Test
    void test_divisibile_by_100_but_not_400_are_not_leap_years(){
        assertEquals(true, LeapYear.isLeapYear(100));
    }
    @Test
    void test_2000_is_a_Leap_Year(){
        assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    void test_1900_is_not_a_Leap_Year(){
        assertEquals(false, LeapYear.isLeapYear(1900));
    }

    @Test
    void test_1800_is_not_a_Leap_Year(){
        assertEquals(false, LeapYear.isLeapYear(1800));
    }
    @Test
    void test_1700_is_not_a_Leap_Year(){
        assertEquals(false, LeapYear.isLeapYear(1700));
    }

    @Test
    void test_1600_is_a_Leap_Year(){
        assertEquals(true, LeapYear.isLeapYear(1600));
    }
}

