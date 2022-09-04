package demo.map;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String[] site = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(site[r.nextInt(site.length)]);
        }
//        System.out.println(sb);
        Map<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (maps.containsKey(c)) {
                maps.put(c, maps.get(c) + 1);
            } else {
                maps.put(c, 1);
            }
        }
        System.out.println(maps);
        //set
        //集合嵌套，案例
        Map<String, List<String>> data = new HashMap<>();
        //把学生数据存进去
        List<String> select = new ArrayList<>();
        Collections.addAll(select, "A", "B");//   元素放入集合
        data.put("罗永", select);
        List<String> select1 = new ArrayList<>();
        Collections.addAll(select1, "D", "C", "A");//   元素放入集合
        data.put("李永", select1);
        List<String> select2 = new ArrayList<>();
        Collections.addAll(select2, "A", "B", "C", "D");//   元素放入集合
        data.put("黄绢", select2);
        //统计景点个数
        Map<String, Integer> infos = new HashMap<>();
        //提取所有人选择的景点信息
        Collection<List<String>> values = data.values();
        //{[],[]}
        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);


    }
}
