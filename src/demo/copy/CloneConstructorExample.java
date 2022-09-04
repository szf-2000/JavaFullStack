package demo.copy;
public class CloneConstructorExample {
    private int[] arr;

    public CloneConstructorExample(int length) {
        arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    /**
     * 深拷贝
     *
     * @param original original 是要拷贝的对象
     */
    public CloneConstructorExample(CloneConstructorExample original) {
        arr = new int[original.arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = original.arr[i];
        }
    }

    public void setArr(int index, int value) {
        arr[index] = value;
    }

    public int getArr(int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        CloneConstructorExample c1 = new CloneConstructorExample(10);
        CloneConstructorExample c2 = new CloneConstructorExample(c1);
        c1.setArr(1,2);
        System.out.println(c2.getArr(1));
        System.out.println(c1.getArr(1));
    }
}
