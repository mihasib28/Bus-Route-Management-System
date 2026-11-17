
package busroute;

public class ShuttleRoute extends Route {

    public ShuttleRoute(String start, String end, double distance) {
        super(start, end, distance);
    }

    @Override
    public int calculateFare() {
        return (int) Math.round(distance * 5);
    }

    @Override
    public String getSchedule() {
        return "Every 10 minutes";
    }

    @Override
    public String getRouteType() {
        return "ShuttleRoute";
    }
}
