package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import clases.Maximos;

public class TestMaximos {

    @Test
    public void testMaximoDe2EnterosPositivos() {
        Assertions.assertEquals(5, Maximos.maximoDe2EnterosPositivos(3, 5));
        Assertions.assertEquals(3, Maximos.maximoDe2EnterosPositivos(5, 3));
        Assertions.assertEquals(0, Maximos.maximoDe2EnterosPositivos(0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(-1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(0, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(-1, -2));
    }

    @Test
    public void testMaximoDe3EnterosPositivos() {
        Assertions.assertEquals(6, Maximos.maximoDe3EnterosPositivos(3, 5, 6));
        Assertions.assertEquals(6, Maximos.maximoDe3EnterosPositivos(3, 6, 5));
        Assertions.assertEquals(6, Maximos.maximoDe3EnterosPositivos(6, 3, 5));
        Assertions.assertEquals(0, Maximos.maximoDe3EnterosPositivos(0, 0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(-1, 0, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(0, -1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(0, 0, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(-1, -2, -3));
    }
}