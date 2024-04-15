package chapter2;

import java.util.Date;
import java.util.Properties;

/**
 * @author aLieb
 * @date 2024年04月15日 16:10
 */
public class Property {
    /**
     * <pre>
     *     System.out.println(new Date());
     * </pre>
     * <ol>
     *     <li>project 1</li>
     *     <li>project 2</li>
     *     <li>project 3</li>
     * </ol>
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Date());
        // getProperties() 是System的静态方法
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory usage: ");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "
        + rt.totalMemory()
        + " Free Memory = "
        + rt.freeMemory());
    }
}
