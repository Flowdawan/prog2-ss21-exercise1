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

    @DisplayName("Testing what happens if the number of students is not between 1 and 60")
    @Test
    void test_1(){
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(0, 40, 30, 67));
        assertEquals(expected, actual);
    }



}
