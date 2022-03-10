import java.util.Scanner;

public class DemoThrow {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "Toan";
        if (a.equals(b)) {
            System.out.println(a);
        } else {
            throw new Exception();
        }
    }
}
