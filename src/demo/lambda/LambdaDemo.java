package demo.lambda;

public class LambdaDemo implements Swimming{
    public static String go(Swimming swimming){
       return swimming.swim();
    }

    public static void main(String[] args) {
//        LambdaDemo demo = new LambdaDemo();
        //  类 "派生自 Swimming 的匿名类" 必须声明为抽象，或为实现 "Swimming" 中的抽象方法 "swim()"
        //灰色new Swimming代码可以简化，官方的代码直接command+单机进入查看是不是FunctionalInterface
        Swimming swimming = new Swimming() {

            @Override
            public String swim() {
                return "teacher is good Swimming!";
            }
        };

        System.out.println(go(() -> {
            return "student is good swimming!";
        }));
    }

    @Override
    public String swim() {
        return null;
    }
}

@FunctionalInterface
//有且只有一个抽象方法
interface Swimming{
    String swim();
}
