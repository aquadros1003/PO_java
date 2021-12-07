package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return null;
    }
}
