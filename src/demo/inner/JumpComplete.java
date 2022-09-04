package demo.inner;

public class JumpComplete {
    public void method(Jumpping j){ //实际上参数是接口Jumpping的对象，只要传入的是对象就行
        j.jump();
    }
    public static void main(String[] args) {
        JumpComplete j = new JumpComplete();
        Jumpping cat = new Cat();
        j.method(cat);
        System.out.println("-----------");
        //使用类匿名内部类，就不需要创建更多的类
        j.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("dog can jump ");
            }
        });
    }
}
