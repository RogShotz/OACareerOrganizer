import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class CareerData {
    private static ArrayList<Career> careers = new ArrayList<>();

    public static void load(File fileName) throws FileNotFoundException {
        Scanner input = new Scanner(fileName);
        while (input.hasNext()) {
            //                 name            , start time      , end time        , capacity
            Career career = new Career(input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt());
            careers.add(career);
            input.nextLine(); // skips new line
            input.nextLine();
        }
        careers.stream().forEach(System.out::println);
    }
}
