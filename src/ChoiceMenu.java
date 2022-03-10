import java.util.Scanner;

public class ChoiceMenu {
    public static void main(String[] args) {
        int choice = menu();
        System.out.println(choice);
    }

    public static int menu() {
        System.out.println("1. Creat");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (Exception e) {
            return menu();
        }
    }
}