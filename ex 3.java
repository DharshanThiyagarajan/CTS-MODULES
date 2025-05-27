import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
        sc.close();
    }
}
