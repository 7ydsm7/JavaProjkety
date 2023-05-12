import java.util.Scanner;

public class RezerwacjaKina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaMiejsc = 10;
        boolean[] miejsca = new boolean[liczbaMiejsc];

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl dostępne miejsca");
            System.out.println("2. Zarezerwuj miejsce");
            System.out.println("0. Zakończ"); 

            int wybor = scanner.nextInt();

            if (wybor == 0) {
                break;
            }

            switch (wybor) {
                case 1:
                    System.out.println("Dostępne miejsca:");
                    for (int i = 0; i < liczbaMiejsc; i++) {
                        if (!miejsca[i]) {
                            System.out.print(i + 1 + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Podaj numer miejsca do zarezerwowania: ");
                    int numerMiejsca = scanner.nextInt();

                    if (numerMiejsca < 1 || numerMiejsca > liczbaMiejsc) {
                        System.out.println("Niepoprawny numer miejsca.");
                        break;
                    }

                    if (miejsca[numerMiejsca - 1]) {
                        System.out.println("To miejsce jest już zarezerwowane.");
                        break;
                    }

                    miejsca[numerMiejsca - 1] = true;
                    System.out.println("Miejsce " + numerMiejsca + " zostało zarezerwowane.");
                    break;

                default:
                    System.out.println("Niepoprawny wybór.");
            }
        }
    }
}
