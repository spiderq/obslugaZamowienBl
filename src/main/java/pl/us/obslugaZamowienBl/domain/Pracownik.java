package pl.us.obslugaZamowienBl.domain;

import pl.us.obslugaZamowienBl.domain.kluczeZlozone.PracownikPK;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Entity
@Table(name = "Pracownik")
public class Pracownik implements Serializable {

    @EmbeddedId
    private PracownikPK id;

    @Column(name = "nrIdentyfikacyjny")
    private String nrIdentyfikacyjny;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idKategoria")
    private Kategoria kategoria;

    public PracownikPK getId() {
        return id;
    }

    public void setId(PracownikPK id) {
        this.id = id;
    }

    public String getNrIdentyfikacyjny() {
        return nrIdentyfikacyjny;
    }

    public void setNrIdentyfikacyjny(String nrIdentyfikacyjny) {
        this.nrIdentyfikacyjny = nrIdentyfikacyjny;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }
}
