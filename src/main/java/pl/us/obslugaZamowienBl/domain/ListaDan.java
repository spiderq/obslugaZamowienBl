package pl.us.obslugaZamowienBl.domain;

import pl.us.obslugaZamowienBl.domain.kluczeZlozone.ListaDanPK;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
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
}
