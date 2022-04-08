import java.util.Scanner;
import java.util.ArrayList;

public class palindromsandprimes {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter the operation a number to calculate:");
        int num = lScanner.nextInt();
        String strNum = Integer.toString(num);
        String[]  numberType = new  String[4];
        numberType[0] ="The number " + strNum;
        numberType[1] = " is palindrome";
        numberType[2]= ", prime";
        numberType[3]= " and belongs to the fibonacci serie";

        if(!isPalindrome(num)){
            numberType[1] = " is not palindrome";
        };

        if(!isPrime(num)){
            numberType[2] = ", not prime";
        };
        
        if(!isFibonacci(num)){
            numberType[3] = " and it does not belong to the fibonacci serie";
        };

        System.out.println(numberType[0] + numberType[1] + numberType[2] + numberType[3]);

        lScanner.close();
    };


    public static boolean isPalindrome(int num){
        String numElements = Integer.toString(num);
        if(num == 0 || num == 1 ){
            return false;
        };
        for(int i = 0; i < numElements.length(); i++) {
            char first = numElements.charAt(i);
            char last = numElements.charAt(numElements.length()-1-i);
            if(first != last){
                return false;
            };
        }
        return true;
    };

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1 ){
            return false;
        };
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            };
        };
        return true;
    };

    public static boolean isFibonacci(int n){
        ArrayList<Integer> fib = new ArrayList<Integer>();
        if (n <= 0){
            fib.add(0);
        }

        if (n == 1){
            fib.add(0);
            fib.add(1);
        }
        
        if (n >= 2){
            fib.add(0);
            fib.add(1);
            for (int i= 2; i< n+1; i++){
                int fib_i = 0;
                fib_i = fib.get(i-1)+ fib.get(i-2);
                fib.add(fib_i);
            };
        }

        for(int j= 0; j <n; j++){
            if(n == fib.get(j)){
                return true;
            }
        }
        return false;
    };
}
