package org.example;

import java.util.Arrays;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("a and b != 0");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve() {
        if (a == 0) { // Линейное уравнение
            return new double[]{-c / b};
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) return new double[]{};
        if (discriminant == 0) return new double[]{-b / (2 * a)};
        double sqrtDiscriminant = Math.sqrt(discriminant);
        return new double[]{
                (-b + sqrtDiscriminant) / (2 * a),
                (-b - sqrtDiscriminant) / (2 * a)
        };
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
