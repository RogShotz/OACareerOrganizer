import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StuData { // for all student data functions
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void load(File fileName) throws FileNotFoundException {
        Scanner input = new Scanner(fileName);
        while (input.hasNext()) {
            String name = input.nextLine();
            String grade = input.nextLine();
            String ss = input.nextLine();
            String[] prefs = new String[6];
            for (int i = 0; i < 6; i++) // collects all prefs
                prefs[i] = input.nextLine();
            //                       name            , grade           , ss,               prefs
            Student stu = new Student(name, grade, ss, prefs);
            students.add(stu);
            System.out.println(stu);
            input.nextLine(); // skip formatting line
        }
    }

    public static List<Student> filterGrade(String grade) {
        return students.stream().filter(student -> student.getGrade().equals(grade)).collect(Collectors.toList());
    }
}
