package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 15:19
 * 通过参数顺序也可以overload方法
 */
public class OverlandingOrder {
    static void print(String s, int i) {
        System.out.println("String: " + s + " int: " + i);
    }

    static void print(int i, String s) {
        System.out.println("int: " + i + " String: " + s);
    }
    public static void main(String[] args) {
        String s = "sss";
        int i = 10;
        print(s, i);
        print(i, s);
        System.out.println("Hello world!");
    }
}
