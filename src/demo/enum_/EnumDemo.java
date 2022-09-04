package demo.enum_;

public class EnumDemo {
    public void control(Station s){
        switch (s){
            case UP -> System.out.println("UP");
            case DOWN -> System.out.println("DOWN");
            case LEFT -> System.out.println("LEFT");
            case RIGHT -> System.out.println("RIGHT");
        }
    }
    public static void main(String[] args) {
        EnumDemo e = new EnumDemo();
        e.control(Station.UP);
    }
}
