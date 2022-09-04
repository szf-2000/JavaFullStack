package demo.api.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(23);
        s.setName("szf");
        int[] a={1,2,3};
        System.out.println(s.toString());
        System.out.println(a.toString());
    }
}
