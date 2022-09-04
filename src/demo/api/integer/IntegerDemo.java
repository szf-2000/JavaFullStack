package demo.api.integer;

public class IntegerDemo {
    public static void main(String[] args) {
        //字符串转int的2种方式
        //方式一 String -> Integer - > int
        String s="100";
        Integer i =Integer.valueOf(s);
        i.intValue();   //intvalue的返回值是int

        //方式二 String -> int
        int value=Integer.parseInt(s);  //parseInt的返回值直接是int
    }
}
