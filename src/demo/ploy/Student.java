package demo.ploy;

public class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "student:" + super.say() + " " + score;
    }

    public void study() {
        System.out.println("student is studying...");
    }
}
