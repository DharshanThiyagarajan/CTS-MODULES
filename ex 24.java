import java.util.ArrayList;
import java.util.Scanner;

class Exercise24_ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;
        System.out.println("Enter names (type 'done' to finish):");
        while (!(name = sc.nextLine()).equalsIgnoreCase("done")) {
            students.add(name);
        }
        System.out.println("Students:");
        for (String s : students) {
            System.out.println(s);
        }
        sc.close();
    }
}
