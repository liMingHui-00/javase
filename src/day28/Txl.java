package day28;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
public class Txl {
    private String name;
    private String phone;
    private String groupName;
    public Txl() {}
    public Txl(String name, String phone) {
        this.name = name;
        this.phone = phone;
        try {
            this.groupName =new Pinyin4j().toPinYinLowercaseInitials(name);
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            throw new RuntimeException(e);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGroupName() {
        return groupName;
    }
    public String toString() {
        return "Txl{name = " + name + ", phone = " + phone + ", groupName = " + groupName + "}";
    }
}
