package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 15:23
 * 方法重载中的参数类型转换
 * 若传入参数的范围大于方法定义的参数类型值，则必须显式进行类型转换，否则会报错
 * 若传入参数的范围小于方法定义的参数类型值，则会自动进行类型转换
 * 上述的缩小转换可能会丢失一部分信息，正因为此，编译器强制要求缩小转换时，需要明确指出
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
    void f2(int x) {
        prt("f2(int)");
    }
    void f2(long x) {
        prt("f2(long)");
    }
    void f2(float x) {
        prt("f2(float)");
    }
    void f2(double x) {
        prt("f2(double)");
    }

    void f3(short x) {
        prt("f3(short)");
    }
    void f3(int x) {
        prt("f3(int)");
    }
    void f3(long x) {
        prt("f3(long)");
    }
    void f3(float x) {
        prt("f3(float)");
    }
    void f3(double x) {
        prt("f3(double)");
    }

    void f4(int x) {
        prt("f4(int)");
    }
    void f4(long x) {
        prt("f4(long)");
    }
    void f4(float x) {
        prt("f4(float)");
    }
    void f4(double x) {
        prt("f4(double)");
    }

    void f5(long x) {
        prt("f5(long)");
    }
    void f5(float x) {
        prt("f5(float)");
    }
    void f5(double x) {
        prt("f5(double)");
    }

    void f6(float x) {
        prt("f6(float)");
    }
    void f6(double x) {
        prt("f6(double)");
    }

    void f7(double x) {
        prt("f7(double)");
    }


    void testConstVal() {
        prt("Testing with 5");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
        // 常数5会被当做int处理，并且对于f567这种没有对应int类型参数的overload方法
        // 若传入参数的数据类型小于方法参数，则会将其自动转换处理
//        Testing with 5
//        f1(int)
//        f2(int)
//        f3(int)
//        f4(int)
//        f5(long)
//        f6(float)
//        f7(double)
    }

//    void testChar() {
//        char c = 'x';
//        prt("char argument: ");
//        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
//    }

    void testByte() {
        byte x = 0;
        prt("byte argument: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
//        byte argument:
//        f1(byte)
//        f2(byte)
//        f3(short)
//        f4(int)
//        f5(long)
//        f6(float)
//        f7(double)
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PrimiteOverlanding p = new PrimiteOverlanding();
//        p.testConstVal();
//        p.testChar();
        p.testByte();
    }
}
