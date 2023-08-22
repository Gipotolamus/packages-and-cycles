package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FreelanceServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "srs/test/resources/money.csv")

    public void testCalculate1(int income, int expenses, int threshold, int expected) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold, expected);
//        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testCalculate2() {
//        FreelanceService service = new FreelanceService();
//
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected, actual);
//    }
}