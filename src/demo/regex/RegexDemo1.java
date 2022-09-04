package demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println("szf".matches("[ \\w&&[^_] ]{3}"));  //除去非下划线且只有3个元素
        String ss = "沈中飞的电话号码：18451306773，我的邮箱是szf2000@qq.com,我的第二个手机号18361663332。第三个号码400-100-3233";
//        String[] s1 = ss.split("\\w+"); //split去分割字符窜用数组接收
//        for(String s:s1){
//            System.out.println(s);
//        }
//        String s2 = ss.replaceAll("\\w+"," ");  //替换之后还是字符串
//        System.out.println(s2);
        String regex="(1[3-9]\\d{9})|(400-?\\d{3,9}-?\\d{3,9})|(\\w+@[\\w&&[^_]]{2,9}(\\.[a-z]{2,9}){1,2})";
        Pattern pattern = Pattern.compile(regex);   //让机器识别正则表达式
        Matcher matcher = pattern.matcher(ss);  //去字符串匹配内容
        while (matcher.find()){ //开始查找，用group获取内容
            System.out.println(matcher.group());
        }

    }


}
