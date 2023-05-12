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

        //dla wszystkich rodzaji kapitalizacji
      
       
        //odnośnik do wzoru dla opcji kwartalnej
        int iloscKwartalow = liczbaLat*4;
        double stopaKwartalna = oprocentowanieRoczne / 4;

        //odnośnik dla opcji miesięcznej
        int iloscMiesiecy = liczbaLat*12;
        double stopaMiesieczna = oprocentowanieRoczne / 12;      
        
            System.out.println("Podaj spsób kapitalizacji odsetek: ");
            System.out.println("1. Odsetki roczne");
            System.out.println("2.Odsetki kwartalne");
            System.out.println("3.Odsetki miesieczne");
           

            int wybor = scanner.nextInt();
            
          

        switch (wybor){
 case 1:

             // odsetki składane rocznie 
            double kapital = poczatkowaWartosc * Math.pow(1 + oprocentowanieRoczne, liczbaLat);
            System.out.println("Po " + liczbaLat + " latach zarobisz: " + kapital);
             break;
 case 2:
        //odsetki kwartalne    
            
             kapital = poczatkowaWartosc * Math.pow(1 + stopaKwartalna, iloscKwartalow);
            System.out.println("Po " + liczbaLat + " latach zarobisz: " + kapital);
            break;

        
 case 3:
        //odsetki miesięczne 
         kapital = poczatkowaWartosc * Math.pow(1 + stopaMiesieczna, iloscMiesiecy);
        System.out.println("Po " + liczbaLat + " latach zarobisz: " + kapital);
        break;  
        default:
                System.out.println("Nieprawidłowy wybór.");
                break;
        }
    }  
}