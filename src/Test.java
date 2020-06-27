import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        names[0] = scanner.nextLine();
        System.out.println("Podaj imie");
        names[1] = scanner.nextLine();
        System.out.println("Podaj imie");
        names[2] = scanner.nextLine();
        System.out.println("Podaj imie");
        names[3] = scanner.nextLine();
        System.out.println("Podaj imie");
        names[4] = scanner.nextLine();

        for (int i = 4; i > -1; i--) {
            System.out.println("Czesc: "  + names[i]);
        }
    }

}
