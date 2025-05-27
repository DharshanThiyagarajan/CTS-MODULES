class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two ints: " + add(5, 3));
        System.out.println("Sum of two doubles: " + add(4.5, 6.3));
        System.out.println("Sum of three ints: " + add(1, 2, 3));
    }
}
