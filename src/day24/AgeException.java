package day24;

public class AgeException extends RuntimeException {
    public  AgeException(){
        this("你的年龄不合法");
    }
    public AgeException(String msg){
        super(msg);
    }
}
