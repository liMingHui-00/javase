package day25;

public class AgeException extends RuntimeException{
    public AgeException() {
        this("年龄不合法");
    }
    public AgeException(String msg) {
        super(msg);
    }

}
