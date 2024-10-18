import java.util.*;

public class TransferStation extends Station{

    ArrayList<Station> otherStations = new ArrayList<>();

    public TransferStation(String line, String station){
        super(line, station);
    }

    public void addTransferStationNext(Station station){
        otherStations.add(station);
    }

    public void addTransferStationPrev(Station station){
        otherStations.add(station);
    }

    public String toString(){
        return "TRANSFERSTATION " + getStation() + ": " + getLine() + ", in service: " + isAvailable() + " previous station: " + 
        getPrevStation() + ", next station: " + getNextStation();
    }
}
