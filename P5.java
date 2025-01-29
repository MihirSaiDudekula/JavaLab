import java.util.Scanner;
class StringCompare{
    String str1;
    String str2;

    public StringCompare(String str1, String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String usrStrCmp(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return "Strings not equal";
        for(int i = 0; i < str1.length(); i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                return "Strings not equal";
            }
        }
        return "Strings are equal";
    }

    public String usrStrCmp(String str1, String str2, int n)
    {
        if(n > str1.length() || n > str2.length())
            return "n length exceeds the length of string";
        for(int i = 0; i < n; i++)
        {
            if(str1.charAt(i) != str2.charAt(i)){
                return "Strings are not equal";
            }
        }
        return "Strings are equal up to n characters";
    }
}

public class MethodOverLoad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        System.out.println("1. String Compare");
        System.out.println("2. String compare up to n characters");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                sc.nextLine();
                System.out.println("Enter string 1: ");
                str1 = sc.nextLine();
                System.out.println("Enter string 2: ");
                str2 = sc.nextLine();
                StringCompare str = new StringCompare(str1, str2);
                System.out.println(str.usrStrCmp(str1, str2));
                break;
            
            case 2:
            {
                sc.nextLine();
                System.out.println("Enter string 1: ");
                str1 = sc.nextLine();
                System.out.println("Enter string 2: ");
                str2 = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                str = new StringCompare(str1, str2);
                System.out.println(str.usrStrCmp(str1, str2, n));
                break;
            }
        }
        sc.close();
    }
}
