package day24.work;

public class AgeGT150Exception extends RuntimeException{
    public AgeGT150Exception() {
        this("年龄不合法");
    }
    public AgeGT150Exception(String msg) {
        super(msg);
    }
}
