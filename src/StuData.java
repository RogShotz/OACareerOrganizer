import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StuData { // for all student data functions
    private static ArrayList<String[]> students = new ArrayList<>();

    public static void load(File fileName) throws FileNotFoundException {
        Scanner input = new Scanner(fileName);
        while (input.hasNext()) {
            //                 name            , grade           , prefs------------------------------------
            String[] sNames = {input.nextLine(), input.nextLine(), input.next(), input.next(), input.next()};
            students.add(sNames);
            input.nextLine(); // skips new line
            input.nextLine();
        }

    }

    public static void sep() throws IOException {
        BufferedWriter seWriter = new BufferedWriter(new FileWriter("Seniors.txt"));
        BufferedWriter juWriter = new BufferedWriter(new FileWriter("Juniors.txt"));
        BufferedWriter soWriter = new BufferedWriter(new FileWriter("Sophomores.txt"));
        BufferedWriter frWriter = new BufferedWriter(new FileWriter("Freshmen.txt"));

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i)[1].equals("Senior")) {
                for (int element = 0; element < students.get(i).length; element++) {
                    System.out.println("hell");
                    seWriter.write(students.get(i)[element] + "\n");
                }
                seWriter.write("\n");
            } else if (students.get(i)[1].equals("Junior")) {
                for (int element = 0; element < students.get(i).length; element++) {
                    juWriter.write(students.get(i)[element] + "\n");
                }
                juWriter.write("\n");
            } else if (students.get(i)[1].equals("Sophomore")) {
                for (int element = 0; element < students.get(i).length; element++) {
                    soWriter.write(students.get(i)[element] + "\n");
                }
                soWriter.write("\n");
            } else if (students.get(i)[1].equals("Freshmen")) {
                for (int element = 0; element < students.get(i).length; element++) {
                    frWriter.write(students.get(i)[element] + "\n");
                }
                frWriter.write("\n");
            } else {
                System.out.println("INVALID CLASS TYPE. STUDENT, CLASS: "
                        + students.get(i)[0] + ", " + students.get(i)[1]);
            }
        }
        seWriter.close();
        juWriter.close();
        soWriter.close();
        frWriter.close();
    }
}
