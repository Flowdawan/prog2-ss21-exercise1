import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        if(grades == null || grades.isEmpty() || grades.get(0) < 1 || grades.get(0) > 60 ){
            return null;
        }
        for(int value : grades){
            if(value < 0 || value > 0){
                return null;
            }
        }

        return grades;
    }
}