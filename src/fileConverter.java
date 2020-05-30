import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileConverter {
    public static void convert(String fileName) throws IOException {
        Scanner input = new Scanner(new File(fileName));

        BufferedWriter writer = new BufferedWriter(new FileWriter("mockConvert.txt"));
        input.nextLine(); // Skips header
        while(input.hasNextLine()) {
            String splitted[] = input.nextLine().split(",");
            writer.write(splitted[1] + "\n");
            writer.write(splitted[2] + "\n");
            writer.write(splitted[3] + "\n");
            writer.write(splitted[4] + "\n");
            writer.write(splitted[5] + "\n");
            writer.write("\n"); // Separate the students
        }
        writer.close();
    }
}
