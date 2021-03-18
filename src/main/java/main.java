import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        System.out.println("prog2-ss21-exercise1");

        List<Integer> test1 = new ArrayList<Integer>(Arrays.asList(10, 5, 77, 29, 58, 39, 84, 38, 44, 24, 99));

        Result.gradingStudents(test1);

        System.out.println("Neue Werte 2:\n");
        List<Integer> test2 = new ArrayList<Integer>(Arrays.asList(4, 70, 80, 90, 100));

        Result.gradingStudents(test2);

        System.out.println("Neue Werte 3:\n");
        List<Integer> test3 = new ArrayList<Integer>(Arrays.asList(4, -5, 80, 90, 100));

        Result.gradingStudents(test3);

    }
}
