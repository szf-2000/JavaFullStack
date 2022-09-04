package demo.api.system;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("szf");
//        System.exit(0); //终止当前运行的虚拟机，所以下面的sz应该是不执行的
//        System.out.println("sz");

        System.out.println("——————————");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start));
    }
}
