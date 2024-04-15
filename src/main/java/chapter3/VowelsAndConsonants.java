package chapter3;

/**
 * 随机生成字母检测其是否为元音
 * @author aLieb
 * @date 2024年04月15日 17:49
 * @see CastingNumbers
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // Math.random()产生一个0到1之间的double，具体说是[0, 1)
            char c = (char) (Math.random() * 26 + 'a');
            System.out.println(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y' :
                case 'w' :
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
