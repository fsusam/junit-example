package ait.ie.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentGradeTest {

    private StudentGrade studentGrade;

    @BeforeEach
    public void setup() {
        studentGrade = new StudentGrade();
    }

    @Test
    public void testGradeA() {
        assertEquals(studentGrade.gerGrade(87), 'A');
    }

    @Test
    public void testGradeB() {
        assertEquals(studentGrade.gerGrade(75), 'B');
    }

    @Test
    public void testGradeC() {
        assertEquals(studentGrade.gerGrade(60), 'C');
    }

    @Test
    public void testGradeD() {
        assertEquals(studentGrade.gerGrade(45), 'D');
    }

    @Test
    public void testGradeE() {
        assertEquals(studentGrade.gerGrade(30), 'E');
    }

    @Test
    public void testGradeF() {
        assertEquals(studentGrade.gerGrade(20), 'F');
    }
}
