package pl.edu.uwm.lab07.pl.imiajd.jankowski;

public class Nauczyciel extends Osoba {
        private int pensja;

        public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
            super(nazwisko, rokUrodzenia);
            this.pensja = pensja;
        }

        public int getPensja() {
            return pensja;
        }

        @Override
        public String toString() {
            return super.toString() + "Nauczyciel{" +
                    "pensja=" + pensja +
                    '}';
        }
}


