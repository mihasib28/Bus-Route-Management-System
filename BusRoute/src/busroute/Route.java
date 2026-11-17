
package busroute;

public abstract class Route {

    protected String start;
    protected String end;
    protected double distance;

    public Route(String start, String end, double distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    // Abstract methods
    public abstract int calculateFare();

    public abstract String getSchedule();

    public abstract String getRouteType();

    // Getter methods
    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public double getDistance() {
        return distance;
    }
}
