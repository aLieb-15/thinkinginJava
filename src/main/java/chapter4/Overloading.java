package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 15:13
 */
class Tree {
    private int height;
    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int i) {
        System.out.println("Creating new Tree that is: " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
