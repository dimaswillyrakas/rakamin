package firstProgram;
import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password : ");
        String validPassword = "pswd";

        if (password.equals(validPassword)){
            System.out.println("Welcome!");
        }else {
            System.out.println("Wrong Password!");
        }
        System.out.println("Thanks!");
    }

    public static String prompt (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
