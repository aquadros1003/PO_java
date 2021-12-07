package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {
    String producent;
    LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    public abstract String dzwiek();

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

}
