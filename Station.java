public abstract class Station {
    private Station nextStation;
    private Station prevStation;

    private String station;
    private String line;

    private Boolean inService = true;
    

    public Station(String line, String station){
        this.line = line;
        this.station = station;
    }

    public void addNext(Station station){
        this.nextStation = station;
    }

    public void addPrev(Station station){
        this.prevStation = station;
    }

    public Boolean switchAvailable(){
        return inService;
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

    public Boolean getInService(){
        return inService;
    }

    public Station getNextStation(){
        return nextStation;
    }

    public Station getPrevStation(){
        return prevStation;
    }

    public String toString(){
        return "STATION " + station + ": " + line + ", in service: " + inService + " previous station: " + 
        prevStation + ", next station: " + nextStation;
    }


}
