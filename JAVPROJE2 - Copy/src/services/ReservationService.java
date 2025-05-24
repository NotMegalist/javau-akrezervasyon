package services;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationService {
    private List<Flight> flights;
    private List<Reservation> reservations;
    private final String filename;

    public ReservationService(String filename) {
        this.filename = filename;
        flights = createFlights();
        reservations = loadReservationsFromFile();
    }

    private List<Flight> createFlights() {
        List<Flight> list = new ArrayList<>();

        Location l1 = new Location("Türkiye", "İstanbul", "IST", true);
        Location l2 = new Location("Almanya", "Berlin", "BER", true);

        Airplane a1 = new Airplane("A320", "Airbus", "SN123", 5);
        Airplane a2 = new Airplane("737", "Boeing", "SN456", 3);

        list.add(new Flight(l1, "12:00", a1));
        list.add(new Flight(l2, "15:00", a2));

        return list;
    }

    public void listFlights() {
        for (int i = 0; i < flights.size(); i++) {
            System.out.println((i + 1) + ". " + flights.get(i));
        }
    }

    public void makeReservation(Scanner scanner) {
        listFlights();
        System.out.print("Rezervasyon yapmak istediğiniz uçuşun numarasını girin: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= flights.size()) {
            System.out.println("Geçersiz seçim.");
            return;
        }

        Flight flight = flights.get(index);
        long count = reservations.stream().filter(r -> r.getFlight() == flight).count();
        if (count >= flight.getAirplane().getSeatCapacity()) {
            System.out.println("Bu uçuş için boş koltuk kalmadı.");
            return;
        }

        System.out.print("Ad: ");
        String name = scanner.nextLine();
        System.out.print("Soyad: ");
        String surname = scanner.nextLine();
        System.out.print("Yaş: ");
        int age = Integer.parseInt(scanner.nextLine());

        Reservation reservation = new Reservation(flight, name, surname, age);
        reservations.add(reservation);
        saveReservationToFile(reservation);
        System.out.println("Rezervasyon başarıyla yapıldı!");
    }

    public void listReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Henüz yapılmış rezervasyon yok.");
            return;
        }

        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }

    private void saveReservationToFile(Reservation reservation) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(reservation.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazarken hata oluştu.");
        }
    }

    private List<Reservation> loadReservationsFromFile() {
        List<Reservation> list = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 8) continue;

                String name = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                Location location = new Location(parts[3], parts[4], parts[5], true);
                String time = parts[6];
                Airplane airplane = new Airplane(parts[7], "Marka", "Seri", 5); // basit yükleme
                Flight flight = new Flight(location, time, airplane);
                list.add(new Reservation(flight, name, surname, age));
            }
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu.");
        }

        return list;
    }
}
