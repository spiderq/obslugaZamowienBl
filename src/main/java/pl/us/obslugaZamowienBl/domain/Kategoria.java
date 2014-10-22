package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kuba
 */

@Entity
@Table(name = "Kategoria")
public class Kategoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nazwa")
    private String nazwa;

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
}
