package day26.work;

import java.util.*;

public class RaceInfoTest {
    public static void main(String[] args) {
        HashMap<String, RaceInfo> worldCupMap = new HashMap<>();
        worldCupMap.put("1930", new RaceInfo("第一届", "1930", "乌拉圭", "乌拉圭"));
        worldCupMap.put("1934", new RaceInfo("第二届", "1934", "意大利", "意大利"));
        worldCupMap.put("1938", new RaceInfo("第三届", "1938", "法国", "意大利"));
        worldCupMap.put("1950", new RaceInfo("第四届", "1950", "巴西", "乌拉圭"));
        worldCupMap.put("1954", new RaceInfo("第五届", "1954", "瑞士", "西德"));
        worldCupMap.put("1958", new RaceInfo("第六届", "1958", "瑞典", "巴西"));
        worldCupMap.put("1962", new RaceInfo("第七届", "1962", "智利", "巴西"));
        worldCupMap.put("1966", new RaceInfo("第八届", "1966", "英格兰", "英格兰"));
        worldCupMap.put("1970", new RaceInfo("第九届", "1970", "墨西哥", "巴西"));
        worldCupMap.put("1974", new RaceInfo("第十届", "1974", "前西德", "西德"));
        worldCupMap.put("1978", new RaceInfo("第十一届", "1978", "阿根廷", "阿根廷"));
        worldCupMap.put("1982", new RaceInfo("第十二届", "1982", "西班牙", "意大利"));
        worldCupMap.put("1986", new RaceInfo("第十三届", "1986", "墨西哥", "阿根廷"));
        worldCupMap.put("1990", new RaceInfo("第十四届", "1990", "意大利", "西德"));
        worldCupMap.put("1994", new RaceInfo("第十五届", "1994", "美国", "巴西"));
        worldCupMap.put("1998", new RaceInfo("第十六届", "1998", "法国", "法国"));
        worldCupMap.put("2002", new RaceInfo("第十七届", "2002", "韩日", "巴西"));
        worldCupMap.put("2006", new RaceInfo("第十八届", "2006", "德国", "意大利"));
        worldCupMap.put("2010", new RaceInfo("第十九届", "2010", "南非", "西班牙"));
        worldCupMap.put("2014", new RaceInfo("第二十届", "2014", "巴西", "德国"));
        worldCupMap.put("2018", new RaceInfo("第二十一届", "2018", "俄罗斯", "法国"));
//         从控制台接收一个代表年份的字符串，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界杯，则输出：没有举办世界杯。
        System.out.println("请输入一个年份");
        Scanner scanner = new Scanner(System.in);
        String year = scanner.next();
        Set<String> yearSet = worldCupMap.keySet();
        boolean findWinner = false;
        for (String k:yearSet){
            if (k.equals(year)){
                System.out.println("该年的世界杯冠军是"+worldCupMap.get(k).getWinner()+"球队");
                findWinner = true;
                break;
            }
        }
        if (!findWinner){
            System.out.println("这一年没有举办世界杯");
        }
//从控制台接收一个代表球队名的字符串，输出该球队夺冠的年份列表。
// 例如，读入"巴西"，应当输出 1958 1962 1970 1994 2002读入"荷兰"，应当输出"没有获得过世界杯冠军"
        System.out.println("请输入一个代表球队名的字符串");
        String team = scanner.next();
        Collection<RaceInfo> values = worldCupMap.values();
        Iterator<RaceInfo> iterator = values.iterator();
        boolean isWinner = false;
        while (iterator.hasNext()){
            RaceInfo info = iterator.next();
            if (info.getWinner().equals(team)){
                System.out.println(info.getYear());
                isWinner = true;
            }
        }
//        没有找到的话打印没有获得过世界杯冠军
        if (!isWinner){
            System.out.println("没有获得过世界杯冠军");
        }
    }
}
