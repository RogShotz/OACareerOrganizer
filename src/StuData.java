import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StuData { // for all student data functions
    private static ArrayList<Student> students = new ArrayList<>();

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
            input.nextLine();
        }
    }

    public static Student getStudent(int index) {
        return students.get(index);
    }

    public static String[] getStudent(int index, String grade) throws IOException {
        Scanner input = new Scanner(new File(grade + "s.txt"));
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < 6; j++) { // +1 for the extra newline
                input.nextLine();
            }
        }

        String[] student = {input.nextLine(), input.nextLine(), input.nextLine(), input.next(), input.next()};


        return student;
    }

    public static int getLength(String grade) {
        File file = new File(grade + "s.txt");

        return (int) ((file.length() - 1) / 6) / 5; // /6 for amount of groups, /5 for amount of students
    }
}
