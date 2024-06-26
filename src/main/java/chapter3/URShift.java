package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:25
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10;
        // 4194303
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        // 18014398509481983
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        // -1
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        // -1
        System.out.println(b);
    }
}
