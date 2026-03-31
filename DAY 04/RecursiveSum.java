import java.util.Scanner;

class RecursiveSum{
    static int sumBetweenTwo(int a, int b) {
        if (b > a) {
            return b + sumBetweenTwo(a, b - 1);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter first number: ");
        int secondNum = sc.nextInt();
        System.out.println("Sum is " + sumBetweenTwo(firstNum, secondNum));
    }
}