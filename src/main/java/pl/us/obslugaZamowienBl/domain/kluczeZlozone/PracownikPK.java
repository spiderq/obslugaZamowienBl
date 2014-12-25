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
    private Integer osobaId;

    @Column(name = "idStanowisko")
    private Integer stanowiskoId;

    public Integer getOsobaId() {
        return osobaId;
    }

    public void setOsobaId(Integer osobaId) {
        this.osobaId = osobaId;
    }

    public Integer getStanowiskoId() {
        return stanowiskoId;
    }

    public void setStanowiskoId(Integer stanowiskoId) {
        this.stanowiskoId = stanowiskoId;
    }
}
