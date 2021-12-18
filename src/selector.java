import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class selector {
    public static void select() {
        Random rand = new Random(System.currentTimeMillis()); //randomized seed
        String[] gradeOrder = {"Senior", "Junior", "Sophomore", "Freshman"}; //determines grade priority

        for(int i = 0; i < 4; i++) {
            List<Student> filtStu = StuData.filterGrade(gradeOrder[i]);

            while (filtStu.size() != 0) {
                Student poppedStu = filtStu.get(rand.nextInt(filtStu.size()));
                System.out.println("Processing: " + poppedStu);
                filtStu.remove(poppedStu);
            }
        }
        System.out.println("termine processing");
    }
}
