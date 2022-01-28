package complex;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Complex {

    public static final Complex ZERO = new Complex(0.0, 0.0);
    public static final Complex ONE = new Complex(1.0, 0.0);
    public static final Complex I = new Complex(0.0, 1.0);

    private final double real;
    private final double imag;

    private Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex valueOf(double real, double imag) {
        return new Complex(real, imag);
    }

    public Complex plus(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex minus(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex times(Complex c) {
        return new Complex(this.real * c.real - this.imag * c.imag,
                           this.real * c.imag + this.imag * c.real);
    }

    public Complex divideBy(Complex c) {
        double aux = c.real * c.real + c.imag * c.imag;

        return new Complex((this.real * c.real + this.imag * c.imag) / aux,
                           (this.imag * c.real - this.real * c.imag) / aux);

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Complex)) return false;

        Complex c = (Complex) o;

        return Double.compare(this.real, c.real) == 0
                && Double.compare(this.imag, c.imag) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(this.real) + Double.hashCode(this.imag);
    }
}