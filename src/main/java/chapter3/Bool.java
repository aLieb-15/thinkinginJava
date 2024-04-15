package chapter3;

import java.util.Random;

/**
 * @author aLieb
 * @date 2024年04月15日 17:07
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is: " + (i > j));
        System.out.println("i < j is: " + (i < j));
        System.out.println("i <= j is: " + (i <= j));
        System.out.println("i >= j is: " + (i >= j));
        System.out.println("i == j is: " + (i == j));
        System.out.println("i != j is: " + (i != j));
        System.out.println((i < 10) && (j < 10));
        System.out.println((i < 10) || (j < 10));
    }
}
