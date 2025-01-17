package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import clases.Minimos;

public class TestMinimos {

    @Test
    public void testMinimoDe2EnterosPositivos() {
        Assertions.assertEquals(3, Minimos.minimoDe2EnterosPositivos(3, 5));
        Assertions.assertEquals(3, Minimos.minimoDe2EnterosPositivos(5, 3));
        Assertions.assertEquals(0, Minimos.minimoDe2EnterosPositivos(0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe2EnterosPositivos(-1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe2EnterosPositivos(0, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe2EnterosPositivos(-1, -2));
    }

    @Test
    public void testMinimoDe3EnterosPositivos() {
        Assertions.assertEquals(3, Minimos.minimoDe3EnterosPositivos(3, 5, 6));
        Assertions.assertEquals(3, Minimos.minimoDe3EnterosPositivos(3, 6, 5));
        Assertions.assertEquals(3, Minimos.minimoDe3EnterosPositivos(6, 3, 5));
        Assertions.assertEquals(0, Minimos.minimoDe3EnterosPositivos(0, 0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe3EnterosPositivos(-1, 0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe3EnterosPositivos(0, -1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe3EnterosPositivos(0, 0, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Minimos.minimoDe3EnterosPositivos(-1, -2, -3));
    }
}