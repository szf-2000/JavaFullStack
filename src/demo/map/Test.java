package demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("szf", 23);
        map.put("szf1", 24);
        map.put("szf2", 25);
//        map.put(null,null);
        System.out.println(map);
        //map的遍历方式
        //1 按照键查找值
        Set<String> set = map.keySet();
        for (String s : set) {
            int values = map.get(s);
            System.out.print(values + " ");
        }
        //2 按照键值整体取值
        //调用entrySet将map转换成set集合，set集合是无序，不重复，无索引的集合
        System.out.println();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        //3 lambda表达式遍历
        System.out.println();
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key+"="+value);
//            }
//        });
        map.forEach((key, value)->{System.out.println(key+"="+value);});

    }
}
