package ait.ie.example.junit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class DateUtilsTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void isLeapYearCSVTes(final int year, final boolean shouldBeLeap) {
        assertThat(DateUtils.isLeapYearCSV(year), is(shouldBeLeap));
    }

}
