import java.util.Scanner;
public class sgh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);

        System.out.println("Kwota inwestycji: ");
       double poczatkowaWartosc = scanner.nextDouble();

        System.out.println("Podaj oprocentowanie roczne (np. 1%=0.01): ");
        double oprocentowanieRoczne = scanner.nextDouble();

        System.out.println("Podaj ilość lat: ");
        int liczbaLat = scanner.nextInt();
      
        int wybor = 0;
        double kapital = 0;
        while(true) {
            
            System.out.println("Podaj spsób kapitalizacji odsetek: ");
            System.out.println("1. Odsetki roczne");
            System.out.println("2.Odsetki kwartalne");
            System.out.println("3.Odsetki miesieczne");
            System.out.println("0.Wyjdź");
            wybor = scanner.nextInt();

            if (wybor == 0) {
                System.out.println("Zamkyanie apliakcji...");
                break;
            }
            else if (wybor < 1 || wybor > 3) {
                System.out.println("Wybierz opcję 1-3!");
                continue;
            }


       
          
        switch (wybor){
 case 1:

        kapital = odsetkiRoczne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);
        break;
 case 2:

        kapital = odsetkiKwartalne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);    
        break;
case 3:
        kapital = odsetkiRoczne(poczatkowaWartosc, oprocentowanieRoczne, liczbaLat);        
        break;  
        }
        System.out.println("Po " + liczbaLat + " latach zarobisz: " + kapital);
    }  
        }
           
   
    public static double odsetkiRoczne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
    double kapital = poczatkowaWartosc * Math.pow(1 + oprocentowanieRoczne, liczbaLat);
    return kapital;
    }
   
    public static double odsetkiKwartalne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
        int iloscKwartalow = liczbaLat*4;
        double stopaKwartalna = oprocentowanieRoczne / 4;
        double kapital = poczatkowaWartosc * Math.pow(1 + stopaKwartalna, iloscKwartalow);
        return kapital;
    }
    
    public static double odsetkiMiesieczne(double poczatkowaWartosc, double oprocentowanieRoczne, int liczbaLat) {
        int iloscMiesiecy = liczbaLat*12;
        double stopaMiesieczna = oprocentowanieRoczne / 12; 
        double kapital = poczatkowaWartosc * Math.pow(1 + stopaMiesieczna, iloscMiesiecy);
        return kapital;
    }
}