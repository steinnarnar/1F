/**
 * Created by Steinn Arnar on 28-Mar-17.
 */
public class Flight {

    private String DEPARTURE;
    private String DEPARTURE_AP;
    private String ARRIVAL_AP;
    private String DEPARTURE_DT;
    private String ARRIVAL_DT;
    private int FLIGHT_NR;
    private String DEPARTURE_WD;
    private int PASSENGERS;


            public Flight(int DEPARTURE, int DEPARTURE_AP, int ARRIVAL_AP, int DEPARTURE_DT,int ARRIVAL_DT, int FLIGHT_NR, int DEPARTURE_WD){
                this.DEPARTURE = DEPARTURE;
                this.DEPARTURE_AP = DEPARTURE_AP;
                this.ARRIVAL_AP = ARRIVAL_AP;
                this.DEPARTURE_DT = DEPARTURE_DT;
                this.ARRIVAL_DT = ARRIVAL_DT;
                this.FLIGHT_NR = FLIGHT_NR;
                this.DEPARTURE_WD = DEPARTURE_WD;
                this.PASSENGERS = PASSENGERS;
            }

    public String getDEPARTURE() {
        return DEPARTURE;
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
}
