import model.*;
import services.ReservationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationService reservationService = new ReservationService("reservations.txt");

        while (true) {
            System.out.println("\n--- Uçuş Rezervasyon Sistemi ---");
            System.out.println("1. Uçuşları Listele");
            System.out.println("2. Rezervasyon Yap");
            System.out.println("3. Rezervasyonları Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    reservationService.listFlights();
                    break;
                case "2":
                    reservationService.makeReservation(scanner);
                    break;
                case "3":
                    reservationService.listReservations();
                    break;
                case "4":
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
