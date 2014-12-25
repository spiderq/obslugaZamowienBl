package pl.us.obslugaZamowienBl.domain;

import pl.us.obslugaZamowienBl.domain.kluczeZlozone.ListaSkladnikowPK;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Entity
@Table(name = "ListaSkladnikow")
public class ListaSkladnikow implements Serializable {

    @EmbeddedId
    private ListaSkladnikowPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDanie", insertable = false, updatable = false)
    private Danie danie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSkladnik", insertable = false, updatable = false)
    private Skladnik skladnik;

    public Danie getDanie() {
        return danie;
    }

    public void setDanie(Danie danie) {
        this.danie = danie;
    }

    public Skladnik getSkladnik() {
        return skladnik;
    }

    public void setSkladnik(Skladnik skladnik) {
        this.skladnik = skladnik;
    }
}
