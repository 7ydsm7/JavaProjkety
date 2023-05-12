import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        int wybor = scanner.nextInt();
        double wynik = 0;

        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                break;
            case 2:
                wynik = liczba1 - liczba2;
                break;
            case 3:
                wynik = liczba1 * liczba2;
                break;
            case 4:
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("Niepoprawny wybór.");
                return;
        }

        System.out.println("Wynik: " + wynik);
    }
}
