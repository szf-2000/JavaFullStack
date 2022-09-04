package demo.overrideequals;

public class OverrideEquals {
    private String name;
    private Integer id;

    public OverrideEquals(String name, Integer id) {
        setName(name);
        setId(id);
    }


    @Override
    public boolean equals(Object obj) {
        // 首先判断传进来的obj是否是调用equals方法对象的this本身，提高判断效率
        if (obj == this) {
            return true;
        }
        // 判断传进来的obj是否是null，提高判断效率
        if (obj == null) {
            return false;
        }
        // 判断传进来的obj是否是User对象，防止出现类型转换的异常
        if (obj instanceof OverrideEquals) {
            OverrideEquals user = (OverrideEquals) obj;
            //下面的name用equals是因为String已经重写equaks方法，id因为是基本类型直接用==
            boolean flag = this.name.equals(user.name) && this.id == user.id;
            return flag;
        }
        // 如果没有走类型判断语句说明两个比较的对象它们的类型都不一样，结果就是false了
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public static void main(String[] args) {
        OverrideEquals o1 = new OverrideEquals("szf", 21);
        OverrideEquals o2 = new OverrideEquals("szf", 21);
        boolean b=o1.equals(o2);
        System.out.println(b);
    }
}
