import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Exercise22_FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String data = sc.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data);
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        sc.close();
    }
}
