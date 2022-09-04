package demo.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionAPIDemo {
    public static void main(String[] args) {
        //1.集合添加元素
        Collection<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("szf");
        list1.add("java");
        list1.add("java");
        list1.add("java1");
        list1.add("java2");
        list.add("szf");
        //2.list清空和判断是否为空
//        list.clear();
//        System.out.println(list.isEmpty());
        //3.判断集合中是否包含某个元素
        System.out.println(list.contains("szf"));
        //4.删除元素
        list.remove("szf");//因为是向上继承，不能使用子类的特有的方法，所以无索引
        list1.remove(0);
        //使用迭代器删除
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){ //it.hasNext()相当于敲门问有没有元素
            String ele = it.next(); //如果有元素就叫出来给ele存储
            if("java".equals(ele)){
                it.remove();    //不能用list1.remove("java")因为it指针后移会漏删
                                //用迭代器删除就好
            }
        }
        //5.获取集合大小
        list.size();
        //6.集合转换为数组
        Object[] obj = list.toArray();
        System.out.println(Arrays.toString(obj));
        //拓展
        Collection<String> list3 = new ArrayList<>();
        Collection<String> list4 = new ArrayList<>();
        list3.add("1");
        list3.add("2");
        list4.add("3");
        list4.add("4");
        list3.addAll(list4);//将集合list4的元素全部倒进list3中

        System.out.println("——————————————————————————————");
        //遍历链表的方式
        //1 使用迭代器Iterator
//        Iterator<String> it =list3.iterator();
//        while (it.hasNext()){
//            String ss = it.next();
//            System.out.println(ss);
//        }
        //2 使用增强for循环，有快捷键变量名.for
        for (String s : list3) {
            System.out.println(s);
        }
        //3 lambda方式foreach
        list3.forEach(s -> System.out.println(s));
//          list3.forEach(System.out::println);//也可以遍历


    }
}
