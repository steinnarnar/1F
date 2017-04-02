/**
 * Created by Steinn Arnar on 28-Mar-17.
 */

import java.util.GregorianCalendar
import java.util.List;
import java.util.Calendar;
import java.util.Date;



public class MockStorageComponent implements FlightDB{
    List<Flight> flight;

    public MockStorageComponent() {
        flight = new List<Flight>();

    }

}
