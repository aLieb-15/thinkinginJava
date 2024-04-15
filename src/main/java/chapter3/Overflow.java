package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:36
 */
public class Overflow {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int big = 0x7fffffff;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
