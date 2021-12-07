package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;

class Student extends Osoba {
    public Student(String nazwisko, String kierunek, String[] imiona, LocalDate dataUrodzenia, boolean płeć, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, płeć);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
    private double sredniaOcen;
}
