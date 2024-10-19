
public class Station {
    public Station next;
    public Station prev;

    private String line;
    private String station;

    private Boolean inService = true;  

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

    public Station getPrevStation(){
        return prev;
    }

    public int tripLength(Station station) {
        int tripLength = 0;
        Station currentStation = this;
    
        while (currentStation != null) {
            if (currentStation == station) {
                break;
            }
            tripLength++;
            currentStation = currentStation.next;
        }
    
        // Return the total length of the trip
        return tripLength;
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
