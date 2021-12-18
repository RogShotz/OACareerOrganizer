public class Career {
    private final String name;
    private final int startTime;
    private final int endTime;
    private final int capacity;



    public Career(String name, int startTime, int endTime, int capacity) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
    }



    @Override
    public String toString() {
        return "name: " +name + " st: " + startTime + " et: " + endTime + " cap: " + capacity;
    }
}
