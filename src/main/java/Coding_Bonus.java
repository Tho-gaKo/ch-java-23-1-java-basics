import java.util.Scanner;

public class Coding_Bonus {

    private static void add(int a, int b) {
        System.out.println(a+b);
    }

    private static void subtract(int a,int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b = sc.nextInt();

        if (a>b) {
            subtract(a,b);
        } else {
            add(a,b);
        }
    }
}