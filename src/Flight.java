/**
 * Created by Steinn Arnar on 28-Mar-17.
 */
public class Flight {

    private String DATE;
    private String DEPARTURE_AP;
    private String ARRIVAL_AP;
    private String DEPARTURE_DT;
    private String ARRIVAL_DT;
    private int FLIGHT_NR;
    private String DEPARTURE_WD;
    private int PASSENGERS;
    private Boolean XTRA_LUGGAGE;


            public Flight(String DATE, String DEPARTURE_AP, String ARRIVAL_AP, String DEPARTURE_DT, String ARRIVAL_DT, int FLIGHT_NR, String DEPARTURE_WD, int PASSENGERS, Boolean XTRA_LUGGAGE){
                this.DATE = DATE;
                this.DEPARTURE_AP = DEPARTURE_AP;
                this.ARRIVAL_AP = ARRIVAL_AP;
                this.DEPARTURE_DT = DEPARTURE_DT;
                this.ARRIVAL_DT = ARRIVAL_DT;
                this.FLIGHT_NR = FLIGHT_NR;
                this.DEPARTURE_WD = DEPARTURE_WD;
                this.PASSENGERS = PASSENGERS;
                this.XTRA_LUGGAGE = XTRA_LUGGAGE;
            }

    public String getDATE() {
        return DATE;
    }

    public String  getDEPARTURE_AP(){
        return DEPARTURE_AP;
    }

    public String getARRIVAL_AP() {
        return ARRIVAL_AP;
    }

    public String getDEPARTURE_DT() {
        return DEPARTURE_DT;
    }

    public String getARRIVAL_DT() {
        return ARRIVAL_DT;
    }

    public int getFLIGHT_NR() {
        return FLIGHT_NR;
    }

    public String getDEPARTURE_WD() {
        return DEPARTURE_WD;
    }

    public int getPASSENGERS() {
        return PASSENGERS;
    }

    public Boolean getXTRA_LUGGAGE() {
        return XTRA_LUGGAGE;
    }
}
