package demo.regex;

import java.util.Scanner;

/**
 * 黑马程序员p124 正则表达式
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        //  目标校验手机号码，邮箱，电话号码
//        checkPhone();
        checkMail();
    }


    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true) {  //com+opt+t 选择环绕格式
            System.out.println("please input your phone number!");
            String phoneNum=sc.next();
            if (phoneNum.matches("1[3-9]\\d{9}")){
                System.out.println("register is successful !");
            }
            else {
                System.out.println("please input again !");
            }
        }
    }

    public static void checkMail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your phone number!");
        String mail=sc.next();
        if (mail.matches("\\w{1,20}@[\\w&&[^_]]{2,10}(\\.[\\w&&[^_]]{2,10}){1,2}")){
            //@之前的表示1～20个字符，[\w&&[^_]]{2,10}表示除去下划线的字符2～10个，\\.表示一个点

            System.out.println("register is successful !");
        }
        else {
            System.out.println("please input again !");
        }
    }
}
