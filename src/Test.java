import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < names.length; i++) {
            System.out.println("Podaj imie");
            names[i] = scanner.nextLine();
        }

        for (i = names.length - 1; i > -1; i--) {
            System.out.println("Czesc: "  + names[i]);
        }
    }

}
