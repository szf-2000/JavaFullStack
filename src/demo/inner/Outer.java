package demo.inner;
/**
 * 局部内部类和内部类
 */
public class Outer {
    private int num=10;
    private class Inner{    //私有内部类可以访问外部类的成员和方法
        int num = 20;
        public void innerMethod(){
            int num =30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);//用Outer来调用外部类的成员变量
        }
    }

    /**
     * method方法调用局部内部类的方法
     * 局部内部类能访问外部类的成员和局部变量
     * 外部类不能访问局部内部类
     */
    public void method(){
        int num2 =20;
        class Inner1{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner1 i =new Inner1();
        i.show();
    }

    /**
     * method0 调用内部类的方法
     */
    public void method1(){
        Inner inner = new Inner();
        inner.innerMethod();
    }

    /**
     * 匿名内部类；本质是继承了一个类或者实现了接口的对象
     * new 类名或接口名（）{};要有分号，因为是对象不是类
     */
    public void method2(){
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();   //  他本质是对象所以要调用他自己重写的方法才能输出
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method1();
        outer.method();
        outer.method2();
    }

}
