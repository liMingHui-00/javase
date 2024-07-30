package day18;

public class JuBu {
     public void a(){
         class AA{
             public String name ="局部内部类";
             public void aa(){
                 System.out.println(name);
             }
         }
        AA aa=new AA();
        aa.aa();
     }
}
