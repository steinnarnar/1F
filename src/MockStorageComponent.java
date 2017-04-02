import java.util.ArrayList;

/**
 * Created by Steinn Arnar on 28-Mar-17.
 */

public class MockStorageComponent {
    private ArrayList<Flight> flights;
 public MockStorageComponent(){
     flights = new ArrayList<Flight>();
     Flight flight1 = new Flight("15.04.2017","Reykjavik","Akureyri","1600","1645", 166,"Saturday",35, true);
     flights.add(flight1);
     Flight flight2 = new Flight("15.04.2017","Akureyri","Reykjavík", "2130", "2105", 167,"Saturday",23, false);
     flights.add(flight2);
     Flight flight3 = new Flight("16.04.2017","Reykjavik","Ísafjörður", "0810", "0850", 16,"Sunday",4, false);
     flights.add(flight3);
     Flight flight4 = new Flight("16.04.2017","Ísafjörður","Reykjavík", "0915", "0955", 17,"Saturday",32, false);
     flights.add(flight4);
     Flight flight5 = new Flight("17.04.2017","Reykjavik","Egilsstaðir", "1320", "1420", 345,"Sunday",74,  true);
     flights.add(flight5);
     Flight flight6 = new Flight("17.04.2017","Egilsstaðir","Reykjavík", "1500", "1600", 346,"Sunday",34, false);
     flights.add(flight6);

 }

    public ArrayList<Flight> getFlightsByDate(String DATE) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DATE.equals(flights.get(i).getDATE())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }


    public ArrayList<Flight> getFlightByDepartureLocation(String DEPARTURE_AP, String DATE) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DATE.equals(flights.get(i).getDEPARTURE_AP())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightByArrivalLocation(String ARRIVAL_AP, String DATE) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DATE.equals(flights.get(i).getARRIVAL_AP())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightByStartingTime(String DEPARTURE_DT, String DATE) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DATE.equals(flights.get(i).getDEPARTURE_DT())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }
}


