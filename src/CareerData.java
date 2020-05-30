import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CareerData {
    private static ArrayList<String[]> careers = new ArrayList<>();

    public static void load(File fileName) throws FileNotFoundException {
        Scanner input = new Scanner(fileName);
        while (input.hasNext()) {
            //                 name            , start time      , end time        , filled      , capacity
            String[] career = {input.nextLine(), input.nextLine(), input.nextLine(), input.next(), input.next()};
            careers.add(career);
            input.nextLine(); // skips new line
            input.nextLine();
        }
    }

    public static int getLength(){
        return careers.size();
    }

    public static boolean verify(String name){ // returns if its free or not
        for(int i = 0; i < careers.size(); i++) { // Career name loop
            if(careers.get(i)[0].equals(name) &&
                    Integer.parseInt(careers.get(i)[3]) < Integer.parseInt(careers.get(i)[4])){
                    return true;
            }
        }
        return false;
    }

    public static void select(String name) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Finalized.txt", true));
        writer.write(name);
        writer.close();
    }
}
