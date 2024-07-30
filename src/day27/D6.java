package day27;
import java.util.function.Predicate;
public class D6 {
    public static void main(String[] args) {
        Predicate<Integer> pre = (a)->{
            if (a%2==0){
                return true;
            }else{
                return false;
            }
        };
        boolean bo = pre.test(21);
        System.out.println(bo);
    }
}