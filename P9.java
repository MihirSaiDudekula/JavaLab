import java.util.Scanner;

interface compute{
    double convert(double value);
}

class CurrencyConversion implements compute{
    public double convert(double rupees){
        double euros = rupees * 0.011;
        return euros;
    }
}

class ByteConversion implements compute{
    public double convert(double megabytes){
        double kilobytes = megabytes * 1024;
        return kilobytes;
    }
}

public class ConversionExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter in rupees: ");
        double rupees = sc.nextDouble();
        System.out.print("Enter in megabytes: ");
        double megabytes = sc.nextDouble();

        compute c1 = new CurrencyConversion();
        compute c2 = new ByteConversion();

        System.out.println(rupees + " in euros: " + c1.convert(rupees));
        System.out.println(megabytes + " in kilobytes: " + c2.convert(megabytes));

        sc.close();
    }
}
