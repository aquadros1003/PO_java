package pl.edu.uwm.lab07.pl.imiajd.jankowski;

public class Osoba {
    private final String nazwisko;
    private final int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    class Nauczyciel extends Osoba{
        private int pensja;

        public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
            super(nazwisko, rokUrodzenia);
            this.pensja = pensja;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public int getRokUrodzenia() {
            return rokUrodzenia;
        }

        public int getPensja() {
            return pensja;
        }

        @Override
        public String toString() {
            return "Nauczyciel{" +
                    "nazwisko='" + nazwisko + '\'' +
                    ", rokUrodzenia=" + rokUrodzenia +
                    ", pensja=" + pensja +
                    '}';
        }
    }
}
