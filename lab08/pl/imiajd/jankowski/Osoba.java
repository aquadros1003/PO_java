package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;

abstract class Osoba<imiona> {

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean płeć) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.płeć = płeć;
    }

    public abstract String getOpis();

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPłeć() {
        return płeć;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean płeć;

}
