import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        if(grades == null || grades.isEmpty() || grades.get(0) < 1 || grades.get(0) > 60 || grades.get(0) != grades.toArray().length -1){
            System.out.println("Please check the provided list! Something is wrong with the list!");
            return null;
        }
        for(int value : grades){
            if(value < 0 || value > 100){
                return null;
            }
        }

        return grades;
    }
}