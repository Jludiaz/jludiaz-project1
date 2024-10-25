import java.util.*;

public class TransferStation extends Station{

    ArrayList<Station> otherStations = new ArrayList<>();

    public TransferStation(String line, String station){
        super(line, station);
    }

    public void addTransferStationNext(Station station){
        otherStations.add(station);
        station.setPrevStation(this);
    }

    public void addTransferStationPrev(Station station){
        otherStations.add(station);
        station.setNextStation(this);
    }

    public int tripLength(Station station) {
        Station currentStation = this;
        
        //base case 1: if the stations match (example s1.tripLength(s1))
        if (currentStation == station) {
            return 0; //both of the stations match
        }
        
        //Base case 3: if the station is a transfer station
        if (currentStation == this){
            return 0;
        }

        //base case 2: if the station reaches the end
        if (currentStation.next == null){
            return -1;
        }

        int tripLength = currentStation.next.tripLength(station);
        currentStation = currentStation.next;
        // System.out.println(currentStation.station + " " + station.station);
        if (tripLength != -1){
            return 1 + tripLength;
        }
        return -1; 
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