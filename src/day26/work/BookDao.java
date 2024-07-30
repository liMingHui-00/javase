package day26.work;

public interface BookDao {
    void ui();
    void add();
    void delete();
    void update();
    void selectById();
    void selectByName();
    void selectByPrice();
    void selectAll();
     boolean isOnly(int id);
}
