import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    private static Map<String[], Integer[]> students = new LinkedHashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("stu.txt"));
        while(input.hasNext()) {
            String[] sNames = {input.nextLine(), input.nextLine()}; // name, grade
            Integer[] prefs = {input.nextInt(), input.nextInt(), input.nextInt()}; // the 3 prefs
            System.out.println(sNames[0] + " " + sNames[1]);
            students.put(sNames, prefs);
            input.nextLine(); // skips formatting line
            try {
                input.nextLine(); // skips formatting line
            } catch (NoSuchElementException e) {
                System.out.print("eof");
            }
        }
        for(int i = 0; i < students.size(); i++)
        System.out.println(students.get(i));
    }
}
