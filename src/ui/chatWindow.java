package ui;
import java.util.Scanner;

public class chatWindow {
    // Construct
    public chatWindow() {}

    // Methods
    public void Question() {
        System.out.println("OII!!!, oque gostaria de saber?");
    }

    public String returnRead() {
        Scanner userRead = new Scanner(System.in);
        String response = userRead.nextLine();
        return response;
    }
}
