package day33;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D5 {
    public static HashMap<String,Integer> getcout(File file){
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1!=null){
                if (file1.isFile()){
//                获取文件后缀名
                    String[] split = file1.getName().split("\\.");
                   String hzm = split[split.length-1];
//                   判断有没有后缀名
                    if (hm.containsKey(hzm)){
//                        有
                        int oldCount = hm.get(hzm);
                        hm.put(hzm,oldCount+1);
                    }else {
//                        没有
                        hm.put(hzm,1);
                    }
                }else {
//                    文件夹
                    HashMap<String, Integer> sonMap = getcout(file1);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if (hm.containsKey(key)){
                            int oldCount = hm.get(key);
                            hm.put(key,oldCount+value);
                        }else {
                            hm.put(key,value);
                        }
                    }
                }
            }

        }
        return hm;
    }
    public static void main(String[] args) {
        File file = new File("aa/txl.txt");
        HashMap<String, Integer> aa = getcout(new File("aa"));
        System.out.println(aa);
    }
}
