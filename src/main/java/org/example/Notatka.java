package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notatka {
    private String tytul;
    private String tresc;
    private boolean priorytet;
    private LocalDateTime dataDodania;

    public Notatka(String tytul, String tresc, boolean priorytet) {
        this.tytul = tytul;
        this.tresc = tresc;
        this.priorytet = priorytet;
        this.dataDodania = LocalDateTime.now();
    }

    public Notatka(String tytul) {
        this.tytul = tytul;
        this.tresc = "";
        this.priorytet = false;
        this.dataDodania = LocalDateTime.now();
    }

    public void wyswietlNotatke() {
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("____________________________");
        if (priorytet) {
            System.out.println("Notatka WAŻNA! " + tytul);
        } else {
            System.out.println("Notatka " + tytul);
        }
        System.out.println(tresc);
        System.out.println(dataDodania.format(formatDaty));
        System.out.println("____________________________");
    }
}
