package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {
    @Test
    public void TwoRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 2);
        double[] roots = eq.solve();
        assertArrayEquals(new double[]{2.0, 1.0}, roots);
    }

    @Test
    public void OneRoot() {
        QuadraticEquation eq = new QuadraticEquation(1, 2, 1);
        double[] roots = eq.solve();
        assertArrayEquals(new double[]{-1.0}, roots);
    }

    @Test
    public void NoRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, 0, 1);
        double[] roots = eq.solve();
        assertEquals(0, roots.length);
    }

    @Test
    public void OneRoot1() {
        QuadraticEquation eq = new QuadraticEquation(0, 2, -4);
        double[] roots = eq.solve();
        assertArrayEquals(new double[]{2.0}, roots);
    }

    @Test
    public void InvalidCof() {
        assertThrows(IllegalArgumentException.class, () -> new QuadraticEquation(0, 0, 1));
    }
}
