import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    private static ArrayList<String[]> students = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("mockData.txt"));
        while (input.hasNext()) {
            //                 name            , grade           , prefs------------------------------------
            String[] sNames = {input.nextLine(), input.nextLine(), input.next(), input.next(), input.next()};
            students.add(sNames);
            input.nextLine(); // skips new line
            input.nextLine();
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i)[1]);
        }
    }
}
