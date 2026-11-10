import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class MainTask1 {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Анна", "А-101", 1,
                Arrays.asList(4, 5, 4, 5)));

        students.add(new Student("Иван", "А-101", 1,
                Arrays.asList(2, 3, 2, 2)));

        students.add(new Student("Мария", "Б-202", 2,
                Arrays.asList(5, 4, 5, 4)));

        students.add(new Student("Петр", "Б-202", 2,
                Arrays.asList(3, 3, 4, 3)));

        StudentService.removeStudents(students);

        StudentService.transferStudents(students);

        System.out.println("Студенты первого курса:");
        StudentService.printStudents(students, 1);

        System.out.println("Студенты второго курса:");
        StudentService.printStudents(students, 2);

        System.out.println("Студенты третьего курса:");
        StudentService.printStudents(students, 3);
    }
}
