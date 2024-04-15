package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:56
 */
public class Exercise {
    public static void exercise1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void exercise2() {
        for (int i = 0; i <= 100; i++) {
            if (i == 47) {
                break;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        exercise1();
        System.out.println("============================");
        exercise2();
    }
}
