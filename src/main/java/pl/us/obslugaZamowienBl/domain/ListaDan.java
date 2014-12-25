package pl.us.obslugaZamowienBl.domain;

import pl.us.obslugaZamowienBl.domain.kluczeZlozone.ListaDanPK;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Entity
@Table(name = "ListaDan")
public class ListaDan implements Serializable {

    @EmbeddedId
    private ListaDanPK id;

    @Column(name = "ilosc")
    private Integer ilosc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idZamowienie", insertable = false, updatable = false)
    private Zamowienie zamowienie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDanie", insertable = false, updatable = false)
    private Danie danie;

    public ListaDanPK getId() {
        return id;
    }

    public void setId(ListaDanPK id) {
        this.id = id;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

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
