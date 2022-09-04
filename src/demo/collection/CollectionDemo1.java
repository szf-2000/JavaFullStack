package demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 明确collection体系结构特点
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序，可重复，有索引
        Collection list =new ArrayList();//多态的写法
        list.add("shen zhong fei ");
        list.add(22);
        System.out.println(list);

        //无序，不重复，无索引
        Collection list1 =new HashSet();//多态的写法
        list1.add("shen zhong fei ");
        list1.add(22);
        System.out.println(list1);
    }
}
