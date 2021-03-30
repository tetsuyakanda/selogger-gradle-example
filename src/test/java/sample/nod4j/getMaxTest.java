package sample.nod4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class getMaxTest {
    @Test
    public void getMaxTest1() {
        Assertions.assertEquals(30, Main.getMax(30, 10, 20));
        Assertions.assertEquals(30, Main.getMax(30, 20, 10));
        Assertions.assertEquals(30, Main.getMax(20, 10, 30));
        Assertions.assertEquals(30, Main.getMax(20, 30, 10));
        Assertions.assertEquals(30, Main.getMax(10, 20, 30));
        Assertions.assertEquals(30, Main.getMax(10, 30, 20));
    }
}
