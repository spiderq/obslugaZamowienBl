package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */
@Entity
@Table(name = "Uzytkownik")
public class Uzytkownik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "haslo")
    private String haslo;

    @Column(name = "poziomUprawnien")
    private Short poziomUprawnien;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public Short getPoziomUprawnien() {
        return poziomUprawnien;
    }

    public void setPoziomUprawnien(Short poziomUprawnien) {
        this.poziomUprawnien = poziomUprawnien;
    }
}
