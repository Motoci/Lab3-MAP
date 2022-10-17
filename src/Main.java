import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>() {
            {
                add(11);
                add(64);
                add(22);
                add(17);
                add(99);
                add(41);
            }
        };

        Note.returnRoundedGrades(grades).forEach(System.out::println);
        System.out.println(Note.returnAverage(grades));
        Note.returnNotSufficientGrades(grades).forEach(System.out::println);
        Note.returnMaxRoundedGrade(grades);
    }
}