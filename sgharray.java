import java.util.ArrayList;
import java.util.Scanner;

class sgharray {
    //utworz normalna klase
    static void przyjmijdane() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kwota inwestycji: ");
        double poczatkowaWartosc = scanner.nextDouble();

        System.out.println("Podaj oprocentowanie roczne (np. 1% = 0.01): ");
        double oprocentowanieRoczne = scanner.nextDouble();

        System.out.println("Podaj ilość lat: ");
        int liczbaLat = scanner.nextInt();

        int wybor = 0;
        double kapital = 0;

        ArrayList<Double> wyniki = new ArrayList<>();
    }

        //klasa jako obiekt, nie zagniezdzaj wszystkiego w jednym
        static void kalkulator() {

            System.out.println("Podaj sposób kapitalizacji odsetek: \n 1. Odsetki roczne \n 2. Odsetki kwartalne \n 3. Odsetki miesięczne \n 0. Wyjdź");
            wybor = scanner.nextInt(); //nie pamietam czy w nowej klasie ma stac nowy skaner, sprawdz

            if (wybor == 0) {
                System.out.println("Zamykanie aplikacji...");
                break;
            } else if (wybor < 1 || wybor > 3) {
                System.out.println("Wybierz opcję 1-3!");
                continue;
            }

            switch (wybor) {
                case 1:
                    kapital = odsetkiRoczne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);
                    break;
                case 2:
                    kapital = odsetkiKwartalne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);
                    break;
                case 3:
                    kapital = odsetkiMiesieczne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);
                    break;
            }

            wyniki.add(kapital);
            System.out.println("Po " + liczbaLat + " latach zarobisz: " + kapital);
        }

        System.out.println("Wyniki wszystkich inwestycji:");
        for (int i = 0; i < wyniki.size(); i++) {
            System.out.println("Inwestycja " + (i + 1) + ": " + wyniki.get(i));
        }
    }

    static double odsetkiRoczne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
        double kapital = poczatkowaWartosc * Math.pow(1 + oprocentowanieRoczne, liczbaLat);
        return kapital;
    }

    static double odsetkiKwartalne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
        int iloscKwartalow = liczbaLat * 4;
        double stopaKwartalna = oprocentowanieRoczne / 4;
        double kapital = poczatkowaWartosc * Math.pow(1 + stopaKwartalna, iloscKwartalow);
        return kapital;
    }

    static double odsetkiMiesieczne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
        int iloscMiesiecy = liczbaLat * 12;
        double stopaMiesieczna = oprocentowanieRoczne / 12;
        double kapital = poczatkowaWartosc * Math.pow(1 + stopaMiesieczna, iloscMiesiecy);
        return kapital;
    }
//uruchom po kolei obiekty
    public static void main(String[] args) {
        przymijdane();
        kalkulator();
    }
}
//zrob porzadeczek, indenty sie na bank nie zgadzaja etc, troche na pałe to pozmieniałem ale musisz po prostu sam ogarnąć OOP

