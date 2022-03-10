import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() throws Exception {
        System.out.println("Age");
        Scanner scanner = new Scanner(System.in);
        try {
            int age = Integer.parseInt(scanner.nextLine());
            if (age > 10) {
                System.out.println(age);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            show();
        }
    }
}
