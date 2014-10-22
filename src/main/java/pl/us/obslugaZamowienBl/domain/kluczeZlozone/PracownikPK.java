package pl.us.obslugaZamowienBl.domain.kluczeZlozone;

import pl.us.obslugaZamowienBl.domain.Osoba;
import pl.us.obslugaZamowienBl.domain.Stanowisko;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Embeddable
public class PracownikPK implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOsoba")
    private Osoba osoba;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idStanowisko")
    private Stanowisko stanowisko;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }
}
