public class Student {
    private final String name;
    private static String grade;
    private final String ss; //spartan seminar teacher
    private final String[] prefs = new String[6]; //preferred classes

    public Student(String name, String grade, String ss, String[] prefs) {
        this.name = name;
        this.grade = grade;
        this.ss = ss;
        for(int i = 0; prefs.length < 6; i++)
            this.prefs[i] = prefs[i];
    }

    public static String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " grade: " + grade + " ss: " + ss + " prefs: " + prefs;
    }
}
