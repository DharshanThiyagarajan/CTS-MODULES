import java.util.HashMap;
import java.util.Scanner;

class Exercise25_HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Enter ID and name pairs (0 to stop):");
        while (true) {
            int id = sc.nextInt();
            if (id == 0) break;
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            map.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        if (map.containsKey(searchId)) {
            System.out.println("Name: " + map.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        sc.close();
    }
}
