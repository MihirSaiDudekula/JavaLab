import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();

        try{
            if(a < 0 || b < 0){
                throw new ArithmeticException("Negative numbers not allowed");
            }
            
            c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
