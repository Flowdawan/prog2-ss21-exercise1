//https://github.com/Flowdawan/prog2-ss21-exercise1.git
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

    @BeforeAll
    static void init() {
        System.out.println("Testing for the result class starts!");
    }


    @AfterAll
    public static void finish() {
        System.out.println("Finished Testing Results");
    }

    @DisplayName("Testing if the number of students is not between 1 <= n <= 60 with 0")
    @Test
    void numberOfStudents_Test1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(0, 40, 30, 67));
        assertEquals(expected, actual);
    }


    @DisplayName("Testing if the number of students is not between 1 <= n <= 60 with negative value")
    @Test
    void numberOfStudents_Test2() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(-2, 20, 60, 100, 42));
        assertEquals(expected, actual);
    }

    @DisplayName("Testing if the number of students is not between 1 <= n <= 60 with value above 60")
    @Test
    void numberOfStudents_Test3() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(61, 40, 30, 67));
        assertEquals(expected, actual);
    }

    @DisplayName("Testing if one of the grades is not between 0 <= grades <= 100 with a grad above 101")
    @Test
    void valueOfGradesInvalid_Test1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5, 40, 30, 67, 101, 4));
        assertEquals(expected, actual);

    }

    @DisplayName("Testing if one of the grades is not between 0 <= grades <= 100 with a grad below 0")
    @Test
    void valueOfGradesInvalid_Test2() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5, 40, 20, -2, 60, 4));
        assertEquals(expected, actual);

    }

    @DisplayName("Testing if the parameter list is just 'null'")
    @Test
    void listIsNull_Test1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(null);
        assertEquals(expected, actual);

    }

    @DisplayName("Testing if the parameter list is just empty")
    @Test
    void listIsEmpty_Test1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList());
        assertEquals(expected, actual);
    }

    @DisplayName("Testing that the number of students (first value) defines how much grades are going to get checked\nWith more grades than students")
    @Test
    void studentsNumberEqualGrades_Test1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(3, 70, 80, 90, 100));
        assertEquals(expected, actual);
    }

    @DisplayName("Testing that the number of students (first value) defines how much grades are going to get checked\nWith less grades than students")
    @Test
    void studentsNumberEqualGrades_Test2() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(4, 70, 80, 90));
        assertEquals(expected, actual);
    }

    @DisplayName("Testing that the number of students (first value) defines how much grades are going to get checked\nWith right number of both")
    @Test
    void studentsNumberEqualGrades_Test3() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 70, 80, 90, 100));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(4, 70, 80, 90, 100));
        assertEquals(expected, actual);

    }

    @DisplayName("Testing the grading policy")
    @Test
    void gradingPolicy_Test1() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(10, 5, 77, 29, 60, 40, 85, 40, 45, 24, 100));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(10, 5, 77, 29, 60, 40, 85, 40, 45, 24, 100));
        assertEquals(expected, actual);
    }
}
