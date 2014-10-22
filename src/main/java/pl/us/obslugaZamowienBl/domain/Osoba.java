package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Entity
@Table(name = "Osoba")
public class Osoba implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @Column(name = "adres")
    private String adres;

    @Column(name = "pesel")
    private Integer pesel;

    @Column(name = "nip")
    private Integer nip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }
}
