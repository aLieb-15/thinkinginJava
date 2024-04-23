package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 15:09
 */
class Rock {
    Rock() {
        System.out.println("Creating Rock");
    }

    Rock(int i) {
        System.out.println("Creating Rock " + i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }
}
