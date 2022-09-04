package demo.genericity;

/**
 * 泛型
 */
public class Genericity {
    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
//        Point<String> p=new Point<>();
//        p.setVar("szf");
//        System.out.println(p.getVar());
        Info<String> i = new InfoImpl<String>("szf");
        System.out.println(i.getvalue());
    }

}

/**
 * 泛型类,T要在类名后面
 * 还有多元泛型如 Point<K,V>
 */
class Point<T> {
    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
}

/**
 * 泛型接口
 */
interface Info<T> {
    public T getvalue();
}

class InfoImpl<T> implements Info {
    private T var;

    public InfoImpl(T var) {
        this.setVar(var);
    }

    @Override
    public T getvalue() {
        return this.var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

