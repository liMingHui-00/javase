package day26.work;

public class RaceInfo {
    private String raceNumber;
    private  String year;
    private String place;
    private  String winner;

    public RaceInfo() {
    }

    public RaceInfo(String raceNumber, String year, String place, String winner) {
        this.raceNumber = raceNumber;
        this.year = year;
        this.place = place;
        this.winner = winner;
    }
    public String getRaceNumber() {
        return raceNumber;
    }
    public void setRaceNumber(String raceNumber) {
        this.raceNumber = raceNumber;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String toString() {
        return "RaceInfo{raceNumber = " + raceNumber + ", year = " + year + ", place = " + place + ", winner = " + winner + "}";
    }
}
