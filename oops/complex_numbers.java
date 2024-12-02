package oops;

public class complex_numbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(9, 4);

        Complex a = Complex.add(c2, c1);
        a.printComplex();
    }
}

class Complex {
    int real;
    int img;

    public Complex(int x, int y) {
        real = x;
        img = y;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }
}
