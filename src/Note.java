import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Note {

    public static List<Integer> returnNotSufficientGrades(List<Integer> gradesArray) {
        return gradesArray.stream()
                .filter(el -> el < 40)
                .collect(Collectors.toList());
    }

    public static double returnAverage(List<Integer> gradesArray) {
        double sum = 0;
        for (Integer integer : gradesArray) {
            sum += integer;
        }
        return sum / gradesArray.size();
    }

    public static List<Integer> returnRoundedGrades(List<Integer> gradesArray) {
        return gradesArray.stream()
                .map(
                        el -> {
                            if (el < 38)
                                return el;
                            else if (el % 10 == 2 || el % 10 == 3 || el % 10 == 4) {
                                el = el / 10 * 10 + 5;
                                return el;
                            } else if (el % 10 == 7 || el % 10 == 8 || el % 10 == 9) {
                                el = (el + 10) / 10 * 10;
                                return el;
                            }
                            return el;
                        }
                ).toList();
    }

    public static Integer returnMaxRoundedGrade(List<Integer> gradesArray) {
        return returnRoundedGrades(gradesArray).stream().max(Integer::compareTo).get();
    }
}
