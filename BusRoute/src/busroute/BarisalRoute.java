
package busroute;

public class BarisalRoute extends Route {

    public BarisalRoute(String start, String end, double distance) {
        super(start, end, distance);
    }

    @Override
    public int calculateFare() {
        return (int) Math.round(5 + (distance * 2.5));
    }

    @Override
    public String getSchedule() {
        return "Every 15 minutes";
    }

    @Override
    public String getRouteType() {
        return "BarisalRoute";
    }
}
