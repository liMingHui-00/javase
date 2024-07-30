package day20;

public interface BookDao {
    void  ui();
    void  add();
    void  delete();
    void  update();
    void  selectById();
    void  selectByName();
    void selectByPrice();
    void selectAll();
      boolean  isOnly(int id);

}
