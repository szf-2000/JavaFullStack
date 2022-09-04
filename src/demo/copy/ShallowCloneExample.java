package demo.copy;

/**
 * 浅拷贝
 */
public class ShallowCloneExample implements Cloneable{
    private int[] arr;

    public ShallowCloneExample(){
        arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i]=i;
        }
    }

    public void setArr(int index,int value) {
        arr[index] = value;
    }

    public int getArr(int index) {
        return arr[index];
    }

    @Override
    protected ShallowCloneExample clone() throws CloneNotSupportedException{
        return (ShallowCloneExample) super.clone();//向下转型
    }


    public static void main(String[] args) throws CloneNotSupportedException {
//        ShallowCloneExample sce= new ShallowCloneExample();
//        sce.setArr(1,2);
//        System.out.println(sce.getArr(1));

        ShallowCloneExample s1 = new ShallowCloneExample();
        ShallowCloneExample s2 = null;
        try{
            s2=s1.clone();//浅拷贝对象地址
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        s1.setArr(1,2);
        System.out.println(s2.getArr(1));
    }
}
