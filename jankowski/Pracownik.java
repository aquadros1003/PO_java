package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;

class Pracownik extends Osoba {
    public Pracownik(double pobory, String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean płeć, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, płeć);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public String getOpis() {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
