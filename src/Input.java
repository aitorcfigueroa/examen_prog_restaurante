import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public String str() {
        return input.nextLine();
    }

    public int num() {
        return input.nextInt();
    }
}
