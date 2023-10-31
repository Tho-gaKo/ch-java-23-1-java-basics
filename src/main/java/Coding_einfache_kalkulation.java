import java.util.Scanner;

public class Coding_Einfache_Kalkulation {

    private static double add(double a, double b) {
        return a+b;
    }

    private static int subtract(int a, int b) {
        return a-b;
    }

    private static int makePositive(int a) {
        if (a<0) {
            return a*-1;
        } else {
            return a;
        }
    }

    private static int evenOrOdd(int a) {
        int check = a%2;
        if (check == 0) {
            return a;
        } else {
            return a*2;
        }
    }

    private static boolean palindrom(String word) {
        int x = 0;
        for (int i = 0; i<word.length(); i++) {
            if (word.charAt(i)==word.charAt(word.length()-(i+1))) {
                x++;
            }
        }
        if (x==word.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter + for add, Enter - for subtract, Enter ! to makePositive, Enter ? to check for even or odd, Enter ^ to check for Palindrom");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Enter num1");
                double a = sc.nextDouble();
                System.out.println("Enter num2");
                double b = sc.nextDouble();
                double sum1 = add(a,b);

                System.out.println(sum1);
                break;
            case '-':
                System.out.println("Enter num1");
                int c = sc.nextInt();
                System.out.println("Enter num2");
                int d = sc.nextInt();
                int sum2 = subtract(c,d);

                System.out.println(sum2);
                break;
            case '!':
                System.out.println("Enter num to make Positive");
                int makePos = sc.nextInt();
                int sum3 = makePositive(makePos);

                System.out.println(sum3);
                break;
            case '?':
                System.out.println("Enter num to check for odd or even");
                int oddEven = sc.nextInt();
                int sum4 = evenOrOdd(oddEven);

                System.out.println(sum4);
                break;
            case '^':
                System.out.println("Enter word to check for Palindrom");
                String palindrom = sc.next();
                boolean check = palindrom(palindrom);

                System.out.println("Palindrom: " + check);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}{
}
