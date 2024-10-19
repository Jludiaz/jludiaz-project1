public class EndStation extends Station{

    public EndStation (String line, String station){
        super(line, station);
    }

    public void makeEnd() {
    
        if (this.next == null && this.prev != null) {
            this.next = this.prev;
        }
        
        if(this.next != null && this.prev != null){
            this.prev = this.next;
        }
    }

    public String toString(){
        String stationInformation =  "ENDSTATION " + getStation() + ": " + getLine() + " line, in service: " + isAvailable();
        String prevStation = "none"; 
        if (prev != null && prev.getStation() != null) {
            prevStation = prev.getStation();
        }

        String nextStation = "none"; 
        if (next != null && next.getStation() != null) {
            nextStation = next.getStation(); 
        }

        return stationInformation + ", previous station: " + prevStation + ", next station: " + nextStation;
    }
    
}