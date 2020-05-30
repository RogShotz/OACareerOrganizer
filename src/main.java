import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        fileConverter.convert("Mock Data (Responses) - Form Responses 1.csv");
        StuData.load(new File("mockData.txt"));
        StuData.sep();
        CareerData.load(new File("mockCareers.txt"));
        selector.select();


        System.out.println("Finished"); // program checking
    }
}
