package demo.copy;

public class DeepCloneExample implements Cloneable {
    private int[] arr;

    public DeepCloneExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void setArr(int index, int value) {
        arr[index] = value;
    }

    public int getArr(int index) {
        return arr[index];
    }

    @Override
    protected DeepCloneExample clone() throws CloneNotSupportedException {
        DeepCloneExample deep = (DeepCloneExample) super.clone();//重新创建对象
        deep.arr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            deep.arr[i] = arr[i];
        }
        return deep;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
//        ShallowCloneExample sce= new ShallowCloneExample();
//        sce.setArr(1,2);
//        System.out.println(sce.getArr(1));

        DeepCloneExample d1 = new DeepCloneExample();
        DeepCloneExample d2 = null;
        try {
            d2 = d1.clone();//浅拷贝对象地址
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        d1.setArr(1, 2);
        System.out.println(d2.getArr(1));
    }
}
