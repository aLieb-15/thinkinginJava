package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 16:51
 * 在类里的多个构造器中使用this可以避免编写重复的代码
 * 需要注意的是，构造器在嵌套调用时，每个构造器只能调用一个构造方法
 * Flower(int petals, String ss)就是一个例子，通过调用Flower(int petals)方法设置整型值，而字符串通过直接赋值进行
 */
public class FLower {
    private int petalCount = 0;
    private String s = new String("null");
    FLower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    FLower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    FLower(int petals, String ss) {
        this(petals);
        this.s = ss;
        System.out.println("String & int args");
    }

    FLower() {
        this(47, "hi");
        System.out.println("default constructor (no args)");
    }

    void print() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FLower f = new FLower();
        f.print();
    }
}
