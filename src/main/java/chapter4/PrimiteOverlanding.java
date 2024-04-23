package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 15:23
 */
public class PrimiteOverlanding {
    static void prt(String s) {
        System.out.println(s);
    }
    void f1(char x) {
        prt("f1(char)");
    }
    void f1(byte x) {
        prt("f1(byte)");
    }
    void f1(short x) {
        prt("f1(short)");
    }
    void f1(int x) {
        prt("f1(int)");
    }
    void f1(long x) {
        prt("f1(long)");
    }
    void f1(float x) {
        prt("f1(float)");
    }
    void f1(double x) {
        prt("f1(double)");
    }

    void f2(byte x) {
        prt("f2(byte)");
    }
    void f2(short x) {
        prt("f2(short)");
    }

    void testConstVal() {
        prt("Testing with 5");
        f1(5);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PrimiteOverlanding p = new PrimiteOverlanding();
        p.testConstVal();
    }
}
