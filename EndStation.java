public class EndStation extends Station{

    public EndStation (String line, String station){
        super(line, station);
    }

    public void makeEnd() {
        // If only a previous station exists, set the end station's next to itself.
        // if (this.next == null && this.prev != null) {
        //     this.setNextStation(this.getPrevStation());
        // }else if (this.next != null && this.prev == null){
        //     this.setPrevStation(this.getNextStation());
        // }

    
        if (this.next == null && this.prev != null) {
            this.next = this.prev;
            //System.out.println("THIS NEXT" + this.next);
        }
        
        if(this.next != null && this.prev == null){
            //System.out.println("THIS NEXT" + this.next);
            this.prev = this.next;
           // System.out.println("THIS PREVIOUS" + this.prev);
        }
    
        // If both previous and next are present, align them appropriately.
        // if (this.next != null && this.prev != null) {
        //     this.prev.setPrevStation(this);  // Previous points to this as end.
        //     this.next.prev = this;  // Next points back to this.
        // }
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