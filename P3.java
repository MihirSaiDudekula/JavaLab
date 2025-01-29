import java.util.Scanner;
public class Complex {
    double a, b;
    public Complex(){
        this.a = 0;
        this.b = 0;
    }

    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    void add(Complex c)
    {
        double sumReal = this.a + c.a;
        double sumImag = this.b + c.b;
        System.out.println("Sum: " + sumReal + " + " + sumImag + "i");
    }
    void sub(Complex c)
    {
        double diffReal = this.a - c.a;
        double diffImag = this.b - c.b;
        System.out.println("Difference: " + diffReal + " + " + diffImag + "i");
    }

    void compare(Complex c)
    {
        if(this.a == c.a && this.b == c.b)
            System.out.println("The Complex numbers are equal");
        else
            System.out.println("The Complex numbers are not equal");
    }

    void displayDetails(){
        if(b < 0)
            System.out.println("Complex number: " + this.a + " + " + Math.abs(this.b) + "i");
        else
            System.out.println("Complex number: " + this.a + " + " + this.b + "i");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a1 = 0.0, b1 = 0.0, a2 = 0.0, b2 = 0.0;
        System.out.print("Enter the real part of complex number 1: ");
        a1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of complex number 1: ");
        b1 = sc.nextDouble();
        System.out.print("Enter the real part of complex number 2: ");
        a2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of complex number 2: ");
        b2 = sc.nextDouble();

        Complex c1 = new Complex(a1, b1);
        Complex c2 = new Complex(a2, b2);

        c1.add(c2);
        c1.sub(c2);
        c1.compare(c2);

        sc.close();
    }
}
