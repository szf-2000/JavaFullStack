package demo.ploy;

/**
 * 多态数组
 */
public class PloyArray {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("szf", 22);
        people[1] = new Student("szf", 22, 100);
        people[2] = new Teacher("szf", 22, 20000);
        //向下转型使用子类方法
        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].say());
            if (people[i] instanceof Student) {
                ((Student) people[i]).study();//向下转型，在向下转型之前，要先向上转型
            } else if (people[i] instanceof Teacher) {
                ((Teacher) people[i]).teach();
            }
        }
    }
}
