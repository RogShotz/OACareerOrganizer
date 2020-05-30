import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class selector {
    public static void select() throws IOException {
        Random rand = new Random();
        int studentIndex = rand.nextInt(StuData.getLength("Sophomore")) - 1; // -1 to allow for 0 to occur
        System.out.println(studentIndex);
        String scope = "Sophomore";

        //while(studentIndex > StuData.getLength("Sophomore") - 1) {
            String student[] = StuData.getStudent(studentIndex, scope);
            BufferedWriter writer = new BufferedWriter(new FileWriter("Finalized.txt"));
            writer.write(student[0] + "\n"); // Writes stuff to finalized
            writer.write(student[1] + "\n");
            writer.close();
            String choice1 = student[2];
            String choice2 = student[3];
            String choice3 = student[4];
            if(CareerData.verify(choice1)) {
                CareerData.select(choice1); // adds the selected to finalized
            }
        //}


        for(int i = 0; i < 5; i++) { // displays student
            //System.out.println(student[i]);
        }

    }
}
