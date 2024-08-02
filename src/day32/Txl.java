package day32;
import day28.Pinyin4j;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.io.Serializable;

public class Txl implements Serializable {
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
