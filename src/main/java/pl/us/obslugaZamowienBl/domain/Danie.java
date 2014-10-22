package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by kuba
 */
@Entity
@Table(name = "Danie")
public class Danie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cena")
    private BigDecimal cena;

    @Column(name = "czasWykonania")
    @Temporal(TemporalType.TIME)
    private Date czasWykonania;

    //kategoria
}
