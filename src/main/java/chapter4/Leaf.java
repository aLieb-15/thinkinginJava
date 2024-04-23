package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 16:46
 * this的简单使用
 */
public class Leaf {
    private int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
