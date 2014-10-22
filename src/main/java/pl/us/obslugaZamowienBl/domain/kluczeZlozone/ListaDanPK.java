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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idZamowienie")
    private Zamowienie zamowienie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDanie")
    private Danie danie;

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }

    public Danie getDanie() {
        return danie;
    }

    public void setDanie(Danie danie) {
        this.danie = danie;
    }
}
