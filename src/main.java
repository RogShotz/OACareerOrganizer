import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        fileConverter.convert("Mock Data (Responses).csv");
        StuData.load(new File("mockConvert.txt"));
        CareerData.load(new File("mockCareers.txt"));
        System.out.println("data processed");
        selector.select();

        System.out.println("Finished"); // program checking
    }
}

//TODO: make scheduling system somehow, figure out what can be used to make it so that classes can fill
// and so that Williams can manually input if need be
//TODO: Ask Williams how priority should be handled. Seniors get first pick? Then goes to others per round? Or,
// do seniors get all picks and then finally next grade goes, etc... etc...
//TODO: Ask Williams if all classes always end within one period or of some span multiple? Relates to start/ end times,
// note to self, may affect how blocking works, maybe no end times? Just how many blocks it spans from start?
