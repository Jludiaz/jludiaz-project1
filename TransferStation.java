import java.util.*;

public class TransferStation extends Station{

    ArrayList<Station> connections = new ArrayList<>();

    public TransferStation(String line, String station){
        super(line, station);
    }

    public void addTransferStationNext(Station station){
        connections.add(station);
    }

    public void addTransferStationPrev(Station station){
        connections.add(station);
    }

    public String toString(){
        return "ENDSTATION " + getStation() + ": " + getLine() + ", in service: " + getInService() + " previous station: " + 
        getPrevStation() + ", next station: " + getNextStation();
    }
}
