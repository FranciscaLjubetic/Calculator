import java.util.Scanner;


class calculator {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter the operation ( use + - * or /) and two numbers to calculate:");
        String operation = lScanner.nextLine();
        double a = lScanner.nextDouble();
        double b = lScanner.nextDouble();

        switch(operation)
        {
            case "+":
                System.out.println(a + " + "+ b + " = " + (a+b));
                break;
            case "-":
                System.out.println(a + " - "+ b + " = " + (a-b));
                break;
            case "*":
                System.out.println(a + " * "+ b + " = " + (a*b));
                break;
            case "/":
                if(b==0) System.out.println("Cannot be divided by zero");
                else {
                    System.out.println(a + " / "+ b + " = " + (a/b));
                }
            break;

            default:
                System.out.println("wrong sign, try again");
                break;
        }
        lScanner.close();

    }
}