import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jhlz
 * @version 0.0.1
 * @since 0.0.1
 */
public class JDKTest {

    /**
     * example:
     **/
    @Test
    public void switch_test() {
        Object obj = "Hello";

        var s = switchMethod(obj);
        assertEquals("str Hello", s);
    }

    private String switchMethod(Object obj) {
        return switch (obj) {
            case Integer _ -> "int " + obj;
            case String _ -> "str " + obj;
            default -> "unknow type";
        };
    }

    /**
     * example:
     */
    @Test
    public void my_Test() {
            Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                    .limit(10)
                    .map(n -> n[1])
                    .forEach(x -> System.out.print(x+ ","));

        System.out.println("诗酒趁年华");
    }
}
