import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        fileConverter.convert("Mock Data (Responses).csv");
        StuData.load(new File("mockConvert.txt"));
        StuData.sep();
        /*CareerData.load(new File("mockCareers.txt"));
        selector.select();

*/
        System.out.println("Finished"); // program checking
    }
}
