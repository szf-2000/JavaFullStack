package demo.stream_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 初步体验stream流的方便和快捷
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        Collections.addAll(names,"张三丰","周芷若","赵敏","张强");
//
//        //1.从集合中找出姓张的放到新集合
//        List<String> zhangList =new ArrayList<>();
//        for (String name : names) {
//            if(name.startsWith("张")){
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);
//        //2.找名称长度是3的姓名
//        List<String> zhangTreeList =new ArrayList<>();
//        for (String name : names) {
//            if (name.length()==3){
//                zhangTreeList.add(name);
//            }
//        }
//        System.out.println(zhangTreeList);

        //3.使用stream,filter过滤s是变量名，->代表开始过滤
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));

    }
}
