import java.util.*;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();
        if(grades == null || grades.isEmpty() || grades.get(0) < 1 || grades.get(0) > 60 || grades.get(0) != grades.toArray().length -1){
            System.out.println("Please check the provided list! Something is wrong with the list!");
            return null;
        }


        for(Integer value : grades){
            System.out.println("Grades before rounding Value: " + value );
        }


        for(Integer value: grades){
            if(value < 0 || value > 100){
                System.out.println("A value in the grades is not in the allowed range ( 0-100)");
                return null;
            }if(value < 38){
                result.add(value);
                continue;
            }else if(value % 5 == 3){
                result.add(value+2);
            }else if(value % 5 == 4){
                result.add(value+1);
            }else{
                result.add(value);
            }
        }


        for(Integer value : result){
            System.out.println("Grades after rounding Value: " + value );
        }
        return result;
    }
}