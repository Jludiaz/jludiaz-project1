public class EndStation extends Station{

    public EndStation (String line, String station){
        super(line, station);
    }

    public void makeEnd(){
        //stting the prev station and next station as itself as described in test case 
        addPrev(this);
        addNext(this);
    }

    public String toString(){
        return "ENDSTATION " + getStation() + ": " + getLine() + ", in service: " + getInService() + " previous station: " + 
        getPrevStation() + ", next station: " + getNextStation();
    }
    
}
