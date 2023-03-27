import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static String str() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int num() {
        Scanner input = new Scanner(System.in);
        int num = -1;

        try {
            num = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("[ERROR]: Valor introducido incorrecto.");
        }

        return num;
    }
}
