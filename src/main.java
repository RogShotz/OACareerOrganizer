import java.io.File;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {
        StuData.load(new File("mockData.txt"));
        StuData.sep();



        System.out.println("hello"); // program checking
    }
}
