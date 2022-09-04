package demo.ploy;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "teacher:" + super.say() + " " + salary;
    }

    public void teach() {
        System.out.println("teacher is teaching...");
    }
}
