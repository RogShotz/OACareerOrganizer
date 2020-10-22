import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileConverter {
    public static void convert(String fileName) throws IOException {
        Scanner input = new Scanner(new File(fileName));
        input.nextLine(); // skips header

        BufferedWriter writer = new BufferedWriter(new FileWriter("mockConvert.txt"));
        while(input.hasNextLine()) {
            String temp = input.nextLine();
            int splits = 0;
            for(int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == ',') {
                    splits++;
                }
            }

            for(int i = 1; i <= splits; i++) { // i = 1 skips time and date stamp
                String splitted[] = temp.split(",");
                writer.write(splitted[i] + "\n");

            }
            writer.write("\n"); // Separate the students
        }
        writer.close();
    }
}
