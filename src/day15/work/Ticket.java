package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:00
 */
public class Ticket {
    private  String startStation;
    private String stopStation;
    private  String startTime;
    private  long id;
    private  int price;
    private  String seat;
    private  String trainNumber;

    public  void  printTicketInfo(){
        System.out.println("出发站："+startStation+" 到达站："+stopStation+" 出发时间："+startTime+" 身份证号："+id+" 票价："+price+" 座位号："+seat+" 车次："+trainNumber);
    }
    public Ticket() {
    }

    public Ticket(String startStation, String stopStation, String startTime, long id, int price, String seat, String trainNumber) {
        this.startStation = startStation;
        this.stopStation = stopStation;
        this.startTime = startTime;
        this.id = id;
        this.price = price;
        this.seat = seat;
        this.trainNumber = trainNumber;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }
    public String getStopStation() {
        return stopStation;
    }

    public void setStopStation(String stopStation) {
        this.stopStation = stopStation;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}
