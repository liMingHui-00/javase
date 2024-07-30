package day24;

public class AgeNoException extends Exception {
    public AgeNoException() {
        this("年龄不合法");
    }
    public AgeNoException(String msg){
        super(msg);
    }
}
