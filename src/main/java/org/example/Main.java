package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notatka notatka1 = new Notatka("tenis", "Gra z Ewą w poniedziałek", true);
        System.out.println("Podaj tytuł notatki:");
        String tytul = scanner.nextLine();
        Notatka notatka2 = new Notatka(tytul);
        notatka1.wyswietlNotatke();
        notatka2.wyswietlNotatke();
        scanner.close();
    }
}
