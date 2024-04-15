package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:11
 */
public class ShortCircuit {
    public static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    public static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    public static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    /**
     * 测试逻辑运算符的“短路”
     * @param args
     */
    public static void main(String[] args) {
        if (test1(0) && test2(2) && test3(2)) {
            System.out.println("expression is true");
        } else {
            System.out.println("expression is false");
        }
        /*
        output:
        test1(0)
        result: true
        test2(2)
        result: false
        expression is false
        三个判断条件中第二个为false，则按照从左到右的顺序，第三个判断条件不会再继续进行
         */
    }
}
