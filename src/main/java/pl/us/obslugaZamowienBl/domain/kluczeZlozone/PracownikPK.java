package pl.us.obslugaZamowienBl.domain.kluczeZlozone;

import pl.us.obslugaZamowienBl.domain.Osoba;
import pl.us.obslugaZamowienBl.domain.Stanowisko;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Embeddable
public class PracownikPK implements Serializable {

    @Column(name = "idOsoba")
    private Osoba osobaId;

    @Column(name = "idStanowisko")
    private Stanowisko stanowiskoId;

    public Osoba getOsobaId() {
        return osobaId;
    }

    public void setOsobaId(Osoba osobaId) {
        this.osobaId = osobaId;
    }

    public Stanowisko getStanowiskoId() {
        return stanowiskoId;
    }

    public void setStanowiskoId(Stanowisko stanowiskoId) {
        this.stanowiskoId = stanowiskoId;
    }
}
