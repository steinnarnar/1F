/**
 * Created by Steinn Arnar on 28-Mar-17.
 */
import java.util.ArrayList;
public class FlightSearch {

    public MockStorageComponent dbComponent = new MockStorageComponent();

        public ArrayList<Flight> searchByDate(String DATE) {
        ArrayList<Flight> flights = dbComponent.getFlightsByDate(String DATE);

            return flights;
        }

        public ArrayList<Flight> searchByDepartureLocation(String DEPARTURE_AP) {
            ArrayList<Flight> flights = dbComponent.getFlightByDepartureLocation(String DEPARTURE_AP);
            return flights;
        }

        public ArrayList<Flight> searchByArrivalLocation(String ARRIVAL_AP) {
        ArrayList<Flight> flights = dbComponent.getFlightByDepartureLocation(String ARRIVAL_AP);

            return flights;
        }


        public ArrayList<Flight> searchByDepartureTime(String DEPARTURE_DT) {
            ArrayList<Flight> flights = dbComponent.getFlightByDepartureTime(String DEPARTURE_DT;

            return flights;
        }

}
