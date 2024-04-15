package chapter1;

/**
 * @author aLieb
 * @date 2024年04月15日 15:09
 */
public class Main {
    public static void doStuff(Shape s) {
        s.erase();
        s.draw();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle c = new Circle();
        doStuff(c);
    }
}
