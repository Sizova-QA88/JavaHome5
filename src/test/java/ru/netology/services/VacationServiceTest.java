package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {
//    @Test
//    public void monthOfVacation() {
//        VacationService service = new VacationService();
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(actual, expected);
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbers.csv")
        public void monthOfVacation() {
    VacationService service = new VacationService();


}
}