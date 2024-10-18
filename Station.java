public abstract class Station {
    private Station nextStation;
    private Station prevStation;

    private String station;
    private String line;

    private Boolean isService 
    

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
        if(nextStation != null){
            return true;
        }else{
            return false;
        }
    }

    public void connect(Station station){
        this.nextStation = station;
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



    public String toString(){
        return "STATION " + getStation() + ": ";
    }



}
