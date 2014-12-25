package pl.us.obslugaZamowienBl.domain.kluczeZlozone;

import pl.us.obslugaZamowienBl.domain.Danie;
import pl.us.obslugaZamowienBl.domain.Zamowienie;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Embeddable
public class ListaDanPK implements Serializable {

    @Column(name = "idZamowienie")
    private Integer zamowienieId;

    @Column(name = "idDanie")
    private Integer danieId;

    public Integer getZamowienieId() {
        return zamowienieId;
    }

    public void setZamowienieId(Integer zamowienieId) {
        this.zamowienieId = zamowienieId;
    }

    public Integer getDanieId() {
        return danieId;
    }

    public void setDanieId(Integer danieId) {
        this.danieId = danieId;
    }
}
