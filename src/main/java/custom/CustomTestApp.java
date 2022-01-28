package custom;

import complex.Complex;

public class CustomTestApp {

    public static void main(String[] args) {

        System.out.println("Customlib testing started ------------------\n");

        Complex c = Complex.ONE;
        Complex res = c.times(Complex.I);
        Complex c2;

        System.out.println("ONE * I: " + res);

        c = Complex.valueOf(10.0, 5.0);
        c2 = Complex.valueOf(5.0, 10.0);
        res = c.times(c2);

        System.out.println("c * c2: " + res);

        System.out.println("c == c2: " + c.equals(c2));
        System.out.println("c == c: " + c.equals(Complex.valueOf(10.0, 5.0)));

        System.out.println("\nCustomlib testing finished -----------------");
    }

}