package demo.unchangeCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        //List.of创建List不可变集合
        List<Double> lists = List.of(56.3,34.1,44.2);
        //可取不可在原集合修改添加
        double num = lists.get(1);
        System.out.println(num);
        //创建set不可变
        Set<String> names = Set.of("Jack","Lucky");
        System.out.println(names);
        //创建不可变map
        Map<String,Integer> maps =Map.of("HuaWei",2,"Java",1);
        System.out.println(maps);
    }
}
