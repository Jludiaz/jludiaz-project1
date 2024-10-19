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
        String stationInformation =  "TRANSFERSTATION " + getStation() + ": " + getLine() + " line, in service: " + isAvailable();
        String prevStation = "none"; 
        if (prev != null && prev.getStation() != null) {
            prevStation = prev.getStation();
        }

        String nextStation = "none"; 
        if (next != null && next.getStation() != null) {
            nextStation = next.getStation(); 
        }

        String results = "";

        for(Station station: otherStations){
            results += "\t" + station.toString() + "\n";
        }

        return stationInformation + ", previous station: " + prevStation + ", next station: " + nextStation +
        "\n\tTransfers: \n" + results;
    }
}