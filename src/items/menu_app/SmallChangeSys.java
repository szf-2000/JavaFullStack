package items.menu_app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 零钱通的一个小项目
 */
public class SmallChangeSys {
    private static boolean loop;
    private static boolean loop1;

    public static void main(String[] args) {
        boolean loop1 = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //1.完成零钱通明细
        //思路（1）收入账可以放数组（2）用对象？（3）用string
        String details = "----------------零钱通明细----------------";

        //2.完成收益入账
        //定义变量
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //3.消费
        double consume = 0;


        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账:");
                    money = scanner.nextDouble();
                    if (money < 0) {    //need to refine
                        System.out.println("入账不可为负！");
                    }
                    balance += money;
                    date = new Date();
                    details += "\n入账金额: " + money + "\t余额: " + balance + "\t时间: " + sdf.format(date);
                    break;
                case "3":
                    System.out.println("消费的目的：");
                    String ss = scanner.next();
                    System.out.println("目前余额为：" + balance + "\t输入取款金额：");
                    consume = scanner.nextDouble();
                    if (consume > balance) {    //还要完善
                        System.out.println("余额不足！重新输入");
                        break;
                    }
                    balance -= consume;
                    date=new Date();
                    details+="\nconsume: "+consume+"\tpurpose: "+ss+"\tbalance: "+balance+"\tDate: "+sdf.format(date);
                    break;
                case "4":
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入信息有误");
            }
        } while (loop1);

    }
}
