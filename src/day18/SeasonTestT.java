package day18;

public class SeasonTestT {
    Season season;
    public SeasonTestT() {
    }
    public SeasonTestT(Season season) {
        this.season = season;
    }
    public void asy(){
        System.out.println(getSeason());
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
