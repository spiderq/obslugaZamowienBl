package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kuba
 */
@Entity
@Table(name = "PracownikDanie")
public class PracownikDanie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOsoba")
    private Osoba osoba;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDanie")
    private Danie danie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idZamowienie")
    private Zamowienie zamowienie;

    @Column(name = "czasRealizacji")
    @Temporal(TemporalType.TIME)
    private Date czasRealizacji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Danie getDanie() {
        return danie;
    }

    public void setDanie(Danie danie) {
        this.danie = danie;
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }

    public Date getCzasRealizacji() {
        return czasRealizacji;
    }

    public void setCzasRealizacji(Date czasRealizacji) {
        this.czasRealizacji = czasRealizacji;
    }
}
