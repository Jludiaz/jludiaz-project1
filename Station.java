public class Station {
    public Station next;
    public Station prev;

    private String station;
    private String line;

    private Boolean inService = true;  

    public int tripLength = 0;

    public Station(String line, String station){
        this.line = line;
        this.station = station;
        tripLength++;
    }

    public void addNext(Station station){
        this.next = station;
    }

    public void addPrev(Station station){
        this.prev = station;
    }

    public boolean isAvailable(){
        return inService;
    }

    public void switchAvailable(){
        inService = true;
    }

    public void connect(Station station){
        addNext(station);
        station.addPrev(station);
    }

    public String getStation(){
        return station;
    }

    public void setStation(String station){
        this.station = station;
    }

    public String getLine(){
        return line;
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

    public int tripLength(Station station){
        return station.tripLength;
    }

    public String toString(){
        return "STATION " + station + ": " + line + ", in service: " + isAvailable() + " previous station: " + 
        prev.getStation() + ", next station: " + next.getStation();
    }
}
