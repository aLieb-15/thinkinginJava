package chapter2;

/**
 * @author aLieb
 * @date 2024年04月15日 16:03
 * @see StaticTest
 */
public class StaticFun {
    public static void incr() {
        StaticTest.i++;
    }

    /**
     *
     * @param newVal new value of static value
     */
    public static void setStaticVal(int newVal) {
        StaticTest.i = newVal;
    }

    /**
     *
     * @return return the value of static value
     */
    public static int getStaticVal() {
        return StaticTest.i;
    }
}
