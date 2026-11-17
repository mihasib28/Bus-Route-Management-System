
package busroute;

public class JhalokathiRoute extends Route {

    public JhalokathiRoute(String start, String end, double distance) {
        super(start, end, distance);
    }

    @Override
    public int calculateFare() {
        return (int) Math.round(distance * (550.0 / 170.0));
    }

    @Override
    public String getSchedule() {
        return "Every 2 hours";
    }

    @Override
    public String getRouteType() {
        return "JhalokathiRoute";
    }
}
