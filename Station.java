
public class Station {
    protected Station next;
    protected Station prev;

    protected String line;
    protected String station;

    protected Boolean inService = true;  

    //Pointing to the currentStation it is on

    public Station(String line, String station){
        this.line = line;
        this.station = station;
    }

    public void addNext(Station station){
        this.next = station; 
        station.prev = this;
    }

    public void addPrev(Station station){
        this.prev = station; 
        station.next = this;
    }

    public boolean isAvailable(){
        return inService;
    }

    public void switchAvailable(){
        inService = !inService;
    }

    public void connect(Station station){
        addNext(station);
    }

    public String getStation(){
        if (this.station == null) {return "none";}
        else{ return this.station;}
    }

    public void setStation(String station){
        this.station = station;
    }

    public String getLine(){
        if (this.line == null) {return "none";}
        else{ return this.line;}
    }

    public void setLine(String line){
        this.line = line;
    }

    public Station getNextStation(){
        return next;
    }

    public void setNextStation(Station next){
        this.next = next;
    }

    public Station getPrevStation(){
        return prev;
    }

    public void setPrevStation(Station prev){
        this.prev = prev;
    }

    public int tripLength(Station station) {
        Station currentStation = this;
        
        //base case 1: if the stations match (example s1.tripLength(s1))
        if (currentStation == station) {
            return 0; //both of the stations match
        }

        //base case 2: if the station reaches the end
        if (currentStation.next == null){
            return -1;
        }

        int tripLength = currentStation.next.tripLength(station);

        currentStation = currentStation.next;
        System.out.println(currentStation.station + " " + station.station);

        if (tripLength != -1){
            return 1 + tripLength;
        }

        return -1; 


        // If we reach the end and havent found the station, 
        // if (currentStation.next.next == currentStation) {
        //     return -1;
        // } 
    }

    public boolean equals(Station station){
        if (this.station == station.station && this.line == station.line){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String stationInformation =  "STATION " + getStation() + ": " + getLine() + " line, in service: " + isAvailable();
        String prevStation = "none"; 
        if (prev != null && prev.getStation() != null) {
            prevStation = prev.getStation();
        }

        String nextStation = "none"; 
        if (next != null && next.getStation() != null) {
            nextStation = next.getStation(); 
        }

        //System.out.println(stationInformation + ", previous station: " + prevStation + ", next station: " + nextStation);

        return stationInformation + ", previous station: " + prevStation + ", next station: " + nextStation;
    }

   // STATION Museum: pink line, in service: true, previous station: none, next station: none"
}
